/**
31. Next Permutation
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]
*/


class Solution {
    public void nextPermutation(int[] nums) {
        int breakIdx = -1;

        // 1.We have to find the break index where we can change to get the next
        // permutation
        for (int i = nums.length-2; i >=0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakIdx = i;
                break;
            }
        }

        // 2.If there is no break index then we reverse array and return
        // (LastPermutation)
        if (breakIdx == -1) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        
        }

        //3.if we have break index we find the smmallest element next to break index
        else{
            //int min=nums[nums.length-1];
            int minIdx=-1;
            for(int i=nums.length-1;i>breakIdx;i--){
                if(nums[i]>nums[breakIdx]){
                    minIdx=i;
                    break;
                }
            }
             //4.Now we have the minIdex to swap 
        int temp=nums[minIdx];
        nums[minIdx]=nums[breakIdx];
        nums[breakIdx]=temp;

        for(int x:nums){
            System.out.print(x+" ");
        }        

        //5.Atlast we have to sort from breakIdx to rear
        
        int l1=breakIdx+1;
        int r1=nums.length-1;
        while(l1<=r1){
            int temp1=nums[l1];
            nums[l1]=nums[r1];
            nums[r1]=temp1;

            l1++;
            r1--;
        }
        for(int x:nums){
            System.out.print(x+" ");
        }   

        }

       
    }
}
