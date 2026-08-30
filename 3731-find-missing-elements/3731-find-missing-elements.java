class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
            if(nums[i] > max)
            {
                max = nums[i];
            }

            if(nums[i] < min)
            {
                min = nums[i];
            }
        }

        for(int i = min; i < max; i++)
        {
            if(!set.contains(i))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}