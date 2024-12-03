/**
2109. Adding Spaces to a String

You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in the original string where spaces will be added. Each space should be inserted before the character at the given index.

For example, given s = "EnjoyYourCoffee" and spaces = [5, 9], we place spaces before 'Y' and 'C', which are at indices 5 and 9 respectively. Thus, we obtain "Enjoy Your Coffee".
Return the modified string after the spaces have been added.

 

Example 1:

Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
Output: "Leetcode Helps Me Learn"
Explanation: 
The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
We then place spaces before those characters.
Example 2:

Input: s = "icodeinpython", spaces = [1,5,7,9]
Output: "i code in py thon"
Explanation:
The indices 1, 5, 7, and 9 correspond to the underlined characters in "icodeinpython".
We then place spaces before those characters.
Example 3:

Input: s = "spacing", spaces = [0,1,2,3,4,5,6]
Output: " s p a c i n g"
Explanation:
We are also able to place spaces before the first character of the string.*/
class Solution {
    public String addSpaces(String s, int[] spaces) {
        //Here we use two pointer approach to solve this problem
        
        StringBuilder sb=new StringBuilder();

        sb.append(s.substring(0,spaces[0]));
        int i=1;
        for(; i<spaces.length; i++){
            sb.append(" ");
            sb.append(s.substring(spaces[i-1],spaces[i]));     
            //i,i-1       
        }
        sb.append(" ");
        sb.append(s.substring(spaces[i-1])); 

        return sb.toString();
    
        // for(int i=0;i<s.length();i++){
        //     if(ptr<spaces.length && i==spaces[ptr]){
        //         ans+=" ";
        //         ptr++;
        //     }
        //     if(ptr==spaces.length){
        //         ptr=i;
        //         break;
        //     }
        //     ans+=s.charAt(i);
        // }
        // ans+=s.substring(ptr+1,s.length());
        // return ans;
    }
}
