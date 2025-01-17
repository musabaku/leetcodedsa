class Solution {
    public int[][] kClosest(int[][] point, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->((b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])));
        for(int i = 0;i<point.length;i++){
           pq.offer(point[i]);
           while(pq.size()>k){
                pq.poll();
           }

        }
        int[][] res = new int[k][2];
        for(int i = 0;i<k;i++){
            
            res[i]  = pq.poll();

        }
        return res;
    }
}
