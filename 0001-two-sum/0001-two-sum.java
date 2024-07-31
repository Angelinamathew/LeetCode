class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> result = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        int rem = target - nums[i];
        if(result.containsKey(rem)){
            return new int[]{result.get(rem), i};
        }else{
            result.put(nums[i], i);
        }
       }
       return null;
}
}
