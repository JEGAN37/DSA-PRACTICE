class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int sub = target-nums[i];

            if(hp.containsKey(sub)) {
                return new int [] {hp.get(sub),i};
            }
            hp.put(nums[i],i);
        }

        return new int[]{};
    }
}