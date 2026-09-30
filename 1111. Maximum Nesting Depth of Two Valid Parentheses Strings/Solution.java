class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] resultt = new int[n];
        int level = 0;

        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                level++;
                resultt[i] = level & 1;
            } else {
                resultt[i] = level & 1;
                level--;
            }
        }

        return resultt;
    }
}
