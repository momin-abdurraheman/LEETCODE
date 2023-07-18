class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        // fill HM
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        //Searching 
        for(int i =0;i<nums.length;i++){
            
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index== i){
                    continue;
                }else{
                    return new int[]{i,index};
                }
            }
        }
        
        return new int[]{};

    }
}
