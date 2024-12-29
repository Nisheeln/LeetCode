class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0; // Start index of the current substring
        int max = 0;   // To track the maximum length of substring without repeating characters
        // Iterate through each character in the string using the `end` pointer
        for (int end = 0; end < s.length(); end++) {
            // Iterate over the substring from start to end - 1
            for (int i = start; i < end; i++) {
                // If the current character is already in the substring, move start
                if (s.charAt(i) == s.charAt(end)) {
                    start = i + 1;
                    break; // Break the loop once we find a repeat
                }
            }
            // Update the max length of substring without repeating characters
            max = Math.max(max, end - start + 1);
        }
        return max; // Return the maximum length found
    }
}
