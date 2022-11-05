package Leetcode_August_Challenge;

public class Valid_Palindrome {

    public boolean isPalindrome(String s) {
         // check string if it's null no need to go further direct return false

            if(s==null){
            return false;
            }
            
        // if string contain some char as uppercase or lowercase 
        // this will convert whole string to lowercase 
        s = s.toLowerCase();
     
        // pointed i to intially at 0
        // and j to end of the string (last character) 
        int i=0;
        int j=s.length()-1;
     
        
        while(i<j){
            //if i<j and string char contain a-z and 0-9 loop -> true

            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
                        || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
                i++;
            }
     
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
                        || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
                j--;
            }
            // if one of string char not match i to j 
            // it will return false
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
     // else return true
        return true;
      
        }
}
