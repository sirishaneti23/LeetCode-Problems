class Solution {
    public int heightChecker(int[] heights) {
        int[] new_heights = new int[heights.length];
        for(int i = 0; i< heights.length; i++)
        {
            new_heights[i] = heights[i];
        }

        int count = 0;
        Arrays.sort(new_heights);
        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != new_heights[i])
            {
                count++;
            }
        }
        return count;  
    }
}