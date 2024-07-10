class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        
        for(String log : logs){
            if(log.chars().anyMatch(Character::isLetterOrDigit)){
                count ++;
            }
            else if(log.contains("../")){
                if(count!=0){
                    count--;
                }
            }
        }
        return count;
    }
}