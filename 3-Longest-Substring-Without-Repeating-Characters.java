import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0; // Start index of the substring
        int max = 0; // To track the maximum length
        Map<Character, Integer> charIndexMap = new HashMap<>(); // To store the last index of each character

        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the map, move the start pointer to the right of its last occurrence
            if (charIndexMap.containsKey(s.charAt(end))) {
                start = Math.max(start, charIndexMap.get(s.charAt(end)) + 1);
            }
            
            // Update the maximum length
            max = Math.max(max, end - start + 1);

            // Update the last seen index of the current character
            charIndexMap.put(s.charAt(end), end);
        }

        return max;
    }
}
