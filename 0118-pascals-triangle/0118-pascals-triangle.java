class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> temp = new ArrayList<>();
        temp = construct(n);
        for(int i=0;i<n;i++){
            int length = temp.get(i).size();
            for(int j=0;j<length;j++){
                if(j>0 && j<length-1){
                    temp.get(i).set(j,(int)(temp.get(i-1).get(j-1)+temp.get(i-1).get(j)));
                }
            }

        }
        return temp;

    }

    public List<List<Integer>> construct(int n){
        List<List<Integer>> data = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(1);
            }
            data.add(temp);
            //temp.clear();
        }
        return data;
    
    }
}