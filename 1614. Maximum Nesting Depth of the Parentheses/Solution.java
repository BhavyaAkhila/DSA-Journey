class Solution {
  public int maxDepth(String s) {
    int a = 0;
    int opened = 0;

    for (final char c : s.toCharArray())
      if (c == '(')
        a = Math.max(a, ++opened);
      else if (c == ')')
        --opened;

    return a;
  }
}
