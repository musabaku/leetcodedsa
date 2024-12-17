class Solution {
    // Helper method to find the maximum value in the bloomDay array
    public int max(int[] arr){
        int m = -1;
        // Loop through each element in the array to find the maximum bloom day
        for(int i = 0; i < arr.length; i++){
            if(m < arr[i]){
                m = arr[i];  // Update the maximum day
            }
        }
        return m;  // Return the maximum bloom day
    }

    // Main method to find the minimum day to form m bouquets of k flowers each
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        
        // If it's impossible to form m bouquets because there aren't enough flowers, return -1
        if(m * k > n) return -1;

        // Initialize the binary search range
        int l = 0; // Left boundary (earliest possible day)
        int r = max(bloomDay);  // Right boundary (latest bloom day from the array)
        
        // Initialize the answer variable to track the minimum day
        int ans = Integer.MAX_VALUE;

        // Perform binary search on the days from 0 to the maximum bloom day
        while(l <= r){
            int f = 0;  // Counter for consecutive flowers that have bloomed
            int b = 0;  // Counter for the number of bouquets formed
            int mid = l + (r - l) / 2;  // Midpoint of the current day range

            // Iterate through each bloom day to check if we can form bouquets on this day (mid)
            for(int i = 0; i < n; i++){
                int status = bloomDay[i] - mid;  // Check if flower i has bloomed by day 'mid'
                
                // If a bouquet has already started and flower i hasn't bloomed yet, reset the count
                if(f > 0 && status > 0){
                    f = 0;
                    continue;
                }
                
                // If flower i has bloomed by 'mid' day, continue to check it
                if(status > 0){
                    continue;
                }

                f++;  // Increment the count of consecutive bloomed flowers

                // If we have k flowers for a bouquet, form a bouquet and reset the counter
                if(f == k){
                    b++;  // Form a bouquet
                    f = 0;  // Reset the consecutive flower count for the next bouquet
                }
            }

            // If it's possible to form m bouquets, try to reduce the number of days by searching on the left half
            if(b >= m){
                ans = Math.min(ans, mid);  // Update the answer with the minimum day found
                r = mid - 1;  // Move the right boundary to search for an earlier day
            }
            else{
                l = mid + 1;  // Move the left boundary to search for a later day
            }
        }

        // If no valid day was found, return -1
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        
        // Return the earliest day found to form m bouquets
        return ans;
    }
}
