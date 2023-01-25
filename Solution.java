class Solution {
    public int countAsterisks(String s) {
        int count = 0, cur = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                cur += (cur == 0 ? 1 : -1);
            }
            if (cur == 0 && s.charAt(i) == '*') {
                count++;
            }
        }
        return count;
    }
}
