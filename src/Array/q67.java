package Array;
//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
//
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.


public class q67 {


    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int i=0; i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    if(i>j){
                        ans[0]=j;
                        ans[1]=i;
                    }
                    else{
                        ans[0]=i;
                        ans[1]=j;

                    }
                }
            }
        }
        return ans;

    }
}
