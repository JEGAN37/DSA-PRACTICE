class Solution {
    public void moveZeroes(int[] nums) {
        int dm = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[dm]=nums[i];
                dm++;
            }
        }
        for(int j = dm ; j<nums.length;j++){
            nums[j]=0;
        }
    }
}