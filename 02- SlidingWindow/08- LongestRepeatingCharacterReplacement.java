/*
# Longest Repeating Character Replacement (LC 424)

Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:
int low = 0;
int maxFreq = 0;
for (int high = 0; high < n; high++) {

    update frequency of s.charAt(high)
    maxFreq = max(maxFreq, freq[s.charAt(high)])

    while ((high - low + 1) - maxFreq > k) {
        remove s.charAt(low) from freq
        low++;
    }

    answer = max(answer, high - low + 1);
}

Key Idea:
We maintain a window where we try to make all characters same.
To do that, we check:
(window size - max frequency character in window) <= k

If not, shrink window from left.

Complexity:
Time: O(n)
Space: O(1)  // fixed 26 letters (uppercase English)
*/

Code:

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int l = 0;          // left pointer of window
        int maxFreq = 0;    // highest frequency of any character in current window
        int ans = 0;        // stores final maximum length

        for (int r = 0; r < s.length(); r++) {

            // include current character in the window
            freq[s.charAt(r) - 'A']++;

            // update the max frequency in the window
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            // if replacements needed are more than k, shrink window
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;  // remove left character
                l++;                        // move left pointer forward
            }

            // update best answer so far
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
