class Solution {
    public String sortSentence(String str) {
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            arr[i] = arr[i].charAt(len-1) + arr[i].substring(0,len-1);

        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
          //  int len = arr[i].length();
            arr[i] = arr[i].substring(1);

        }
        str = Arrays.toString(arr).replace((","),"").replace("[","").replace("]","");
        return str;
    }

}