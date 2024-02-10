class Solution {
    public int check(String s, int i, int j) {
        int ans = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            ans++;
            i--;
            j++;
        }
        return ans;
    }

    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += check(s, i, i);
            ans += check(s, i, i + 1);
        }
        return ans;
    }
}
