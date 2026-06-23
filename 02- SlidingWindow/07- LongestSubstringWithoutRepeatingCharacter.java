/*
#Longest Substring Without Repeating Characters
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:
low = 0
for(high = 0; high < n; high++){
    add s.charAt(high) to map
    while(map.get(s.charAt(high)) > 1){
        remove s.charAt(low) from map
        low++
    }
    answer = max(answer, high - low + 1)
}

Key Idea:
Window should contain
only unique characters.
If a duplicate character appears,
shrink the window from the left
until all characters become unique again.

Complexity:
Time: O(n)
Space: O(k)
(k = number of unique characters)
*/

Code:

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Stores unique characters of current window
        HashSet<Character> set = new HashSet<>();

        int low = 0;      // Left pointer
        int maxlen = 0;   // Stores answer

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            // If duplicate found, shrink window from left
            while (set.contains(ch)) {
                set.remove(s.charAt(low));
                low++;
            }

            // Add current character to window
            set.add(ch);

            // Update maximum window size
            maxlen = Math.max(maxlen, high - low + 1);
        }

        return maxlen;
    }
}
