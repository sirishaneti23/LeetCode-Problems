class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];

        for(int[] trip: trips)
        {
            int numpas = trip[0];
            int from = trip[1];
            int to = trip[2];

            arr[from] += numpas;
            arr[to] -= numpas;
        }

        int currentPassengers = 0;
        for(int i = 0; i <= 1000; i++)
        {
            currentPassengers += arr[i];
            if(currentPassengers > capacity)
            {
                return false;
            }
        }
        return true;
    }
}