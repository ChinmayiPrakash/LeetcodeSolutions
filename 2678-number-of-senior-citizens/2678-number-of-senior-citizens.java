class Solution {
    public int countSeniors(String[] details) {
      String age = "";
        int count=0;
        for(int i=0;i<details.length;i++){
            age = details[i].substring(11,13);
            int ageint = Integer.parseInt(age);
            if(ageint >60){
                count++;
            }
}
        return count;
    }
}