// Problem link - https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

// observation - since it is asking for Kth and Smallest, it is Heap problem
// for Smallest we use Max Heap so we can eliminate all larger element from array till we are left with K elements
// now since all larger elements are removed from array and we're left with K elements only, so top element will be our Kth smallest number
        
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
       
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
       
       for (int i = 0; i < arr.length; i++) {
           
           maxHeap.add(arr[i]); // adding element in our max heap
           
           if (maxHeap.size() > k) {
               maxHeap.poll(); // removing all larger elements one by one till only K elements are left in our heap
           }
       }
       
       return maxHeap.peek();
    } 
}
