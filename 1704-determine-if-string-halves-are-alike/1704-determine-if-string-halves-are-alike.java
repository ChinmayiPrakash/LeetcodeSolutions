class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0,((n/2)));
        String b = s.substring((n/2),n);
        System.out.println(a);
        int a_count = countVowels(a);
        System.out.println(a_count);
        System.out.println(b);
        int b_count = countVowels(b);
        System.out.println(b_count);
        if(a_count == b_count){
            return true;
        }
        return false;
    }
    static int countVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                count++;
            }
        }
        return count;
    }
}
