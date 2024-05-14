class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int col=0,count = 0;
        if(ruleKey.equals("type") )
            {
            col = 0;
            System.out.println("type");
            System.out.println("reached col0");
            }
        else if(ruleKey.equals("color"))
           {
            col = 1;
            System.out.println("color");
            System.out.println("reached col1");

            }
        else if(ruleKey.equals("name")) 
            {
            col = 2;
            System.out.println("name");
            System.out.println("reached col2");
        }
        for(int i =0; i<=(items.size()-1) ;i++){
            if(items.get(i).get(col).equals(ruleValue)){
                count++;
                  System.out.println(count +" "+ col);
            }
        }
        return count;
    }
}