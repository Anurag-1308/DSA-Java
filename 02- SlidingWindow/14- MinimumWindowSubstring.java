/*
# Minimum Window Substring (LC 76)
Pattern:
Sliding Window

Window Type:
Variable Size Window (Two Pointers + Frequency Map)

Template:

int[] need = new int[128];
int[] window = new int[128];
for(char c : t.toCharArray()){
    need[c]++;
}

int required = t.length();
int formed = 0;
int low = 0;
int minLen = Integer.MAX_VALUE;
int start = 0;

for(int high = 0; high < s.length(); high++){
    char c = s.charAt(high);
    window[c]++;

    if(need[c] > 0 && window[c] <= need[c]){
        formed++;
    }

    while(formed == required){

        // update answer
        if(high - low + 1 < minLen){
            minLen = high - low + 1;
            start = low;
        }

        char leftChar = s.charAt(low);
        window[leftChar]--;

        if(need[leftChar] > 0 && window[leftChar] < need[leftChar]){
            formed--;
        }

        low++;
    }
}

return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

Key Idea:
Expand the window using right pointer and track character frequency.
When all characters of string t are satisfied in the current window,
try shrinking the window from the left to minimize its size.
Maintain a valid window using:
formed == required
For every valid window:
Try to shrink it while keeping it valid and update minimum length.

Complexity:
Time: O(n)
Space: O(1)   // fixed 128/256 frequency array
*/

Code:
class Solution {
    public String minWindow(String s, String t) {

        // freq map for required characters
        HashMap<Character, Integer> need = new HashMap<>();

        // freq map for current window
        HashMap<Character, Integer> window = new HashMap<>();

        // build need map from t
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int have = 0;                 // how many characters are currently satisfied
        int required = need.size();   // unique characters we must satisfy

        int low = 0;
        int start = 0;               // best window start index
        int minlen = Integer.MAX_VALUE;

        // expand window using high pointer
        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // if this char becomes exactly satisfied, increase "have"
            if (need.containsKey(ch) &&
                need.get(ch).intValue() == window.get(ch).intValue()) {
                have++;
            }

            // when all required chars are satisfied, try shrinking window
            while (have == required) {

                // update answer (minimum window)
                if (high - low + 1 < minlen) {
                    minlen = high - low + 1;
                    start = low;
                }

                // remove leftmost character
                char leftchar = s.charAt(low);
                window.put(leftchar, window.get(leftchar) - 1);

                // if removing breaks requirement, reduce "have"
                if (need.containsKey(leftchar) &&
                    window.get(leftchar) < need.get(leftchar)) {
                    have--;
                }

                low++; // shrink window
            }
        }

        // if no valid window found
        return minlen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minlen);
    }
}
