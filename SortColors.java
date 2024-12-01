/**
75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 */
class Solution {
    public void sortColors(int[] nums) {
        int head=0;//Head to start from left where 0's reside
        int ptr=0;//initial ptr is 0 bcz its going to be compared
        int tail=nums.length-1;//To maintain end

        while(ptr<=tail){//Tp last/swapped element

            if(nums[ptr]==0){ // if num is 0 it should be in front
                swap(ptr,head,nums);
                ptr++;
                head++;//As we swapped
            }
            else if(nums[ptr]==2){//if num is 2 it should be in rear
                swap(ptr,tail,nums);
                tail--;
            }
            else{
                ptr++;//if 1 we no need to change
            }

        }

     
    }
    public void swap(int ptr,int head,int nums[]){ //Function to swap
        int temp=nums[ptr];
        nums[ptr]=nums[head];
        nums[head]=temp;
    }
}
