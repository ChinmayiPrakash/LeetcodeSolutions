class Solution {
    public int[][] kClosest(int[][] points, int k) {
     
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(calculatedistance(o2),calculatedistance(o1)); // Reverse order for max-heap
            }
        });

        for (int[] point:points){
            maxheap.offer(point);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }

        int[][] results = new int[k][2];
        for (int i = 0; i < k; i++) {
            results[i] = maxheap.poll();
        }

        return results;
        
    }
    static int calculatedistance(int[] point){
        return ((point[0]*point[0]) + (point[1]*point[1]));
    }
}