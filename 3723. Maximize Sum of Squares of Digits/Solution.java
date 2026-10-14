class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9L * num) return "";
        int qo = sum / 9;
        int ro = sum % 9;
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < qo; i++) sb.append('9');
        if (ro > 0) sb.append((char)('0' + ro));
        for (int i = qo + (ro > 0 ? 1 : 0); i < num; i++) sb.append('0');
        return sb.toString();
    }
}
