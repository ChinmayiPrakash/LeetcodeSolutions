class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // Reverse order for max-heap
            }
        });
        int val = 0;
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);

        }
        while (!maxHeap.isEmpty()){
            if(maxHeap.size()==1){
                val = maxHeap.poll();
                return val;
            }
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x==y){
                val = x-y;
            }else {
                 val = x-y;
                maxHeap.add(val);
            }
        }
        return val;
    }
}