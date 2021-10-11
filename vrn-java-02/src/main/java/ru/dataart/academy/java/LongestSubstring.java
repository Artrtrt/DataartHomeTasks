package ru.dataart.academy.java;

public class LongestSubstring {
    static final int NO_OF_CHARS = 256;
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        if (checkString.length() == 0) return 0;
        int n = checkString.length();
        int curLen = 1;
        int maxLen = 1;
        int prevIndex;
        int i;
        int[] visited = new int[NO_OF_CHARS];
        for (i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }
        visited[checkString.charAt(0)] = 0;
        for (i = 1; i < n; i++) {
            prevIndex = visited[checkString.charAt(i)];
            if (prevIndex == -1 || i - curLen > prevIndex)
                curLen++;
            else {
                if (curLen > maxLen)
                    maxLen = curLen;
                curLen = i - prevIndex;
            }
            visited[checkString.charAt(i)] = i;
        }
        if (curLen > maxLen)
            maxLen = curLen;
        return maxLen;
    }
}
