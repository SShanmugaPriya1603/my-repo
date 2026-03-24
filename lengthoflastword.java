class Solution {
    public int lengthOfLastWord(String s) {

        String[] str=s.split(" ");
        int len=str.length;
        String lastlen=str[len-1];
        return lastlen.length();
        
    }
}