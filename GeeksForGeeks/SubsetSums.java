/*
Problem link -  https://practice.geeksforgeeks.org/problems/subset-sums2234/1#
*/

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        findSubsets(arr, 0, N, 0, answer);
        
        Collections.sort(answer);
        
        return answer;
    }
    
    private void findSubsets(ArrayList<Integer> arr, int index, int N, int currentSum, ArrayList<Integer> answer) {
        if (index == N) {
            answer.add(currentSum);
            return;
        }
        
        // take
        currentSum += arr.get(index);
        findSubsets(arr, index+1, N, currentSum, answer);
        
        // not take
        currentSum -= arr.get(index);
        findSubsets(arr, index+1, N, currentSum, answer);

    }
}
