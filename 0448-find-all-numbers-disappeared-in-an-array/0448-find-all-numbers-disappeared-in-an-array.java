class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();

        for(int i : nums)
        {
            set.add(i);
        }

        for(int i = 1; i <= nums.length; i++)
        {
            if(!set.contains(i))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}