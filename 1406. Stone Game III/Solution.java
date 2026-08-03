class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dpp = new int[n + 1];
        dpp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            dpp[i] = Integer.MIN_VALUE;
            int sum = 0;
            for (int k = 0; k < 3 && i + k < n; k++) {
                sum += stoneValue[i + k];
                dpp[i] = Math.max(dpp[i], sum - dpp[i + k + 1]);
            }
        }
        if (dpp[0] > 0)
            return "Alice";
        else if (dpp[0] < 0)
            return "Bob";
        else
            return "Tie";
    }
}
