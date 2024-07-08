class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       /* ArrayList<Integer> op = new ArrayList<Integer>();

        HashMap<Integer,Integer> smap = new HashMap<Integer,Integer>();
        for(int num:nums){
            smap.put(num,smap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : smap.entrySet()){
            if(entry.getValue()>=k){
                op.add(entry.getKey());
            }
        }
        if(op.size()==0){
            for(Map.Entry<Integer,Integer> entry : smap.entrySet()){
             if(entry.getValue()==(k-1)){
                op.add(entry.getKey());
            }
        }
        }
        int[] op_array = new int[op.size()];
        for(int i =0;i<op.size();i++){
            op_array[i] = op.get(i);
        }
        return op_array;*/
         // Step 1: Count frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket sort based on frequencies
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        // Step 3: Collect top k frequent elements
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }

        // Convert result list to array
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = result.get(i);
        }

        return topK;
    }
}