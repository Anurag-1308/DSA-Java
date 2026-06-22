/*
#Longest Substring with At Most Two Distinct Characters
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:
low = 0
for(high = 0; high < n; high++){
    add current character
    while(map.size() > 2){
        remove left character
        low++
    }
    answer = max(answer, high - low + 1)
}

Key Idea:
Same as LC 340.
Just k = 2.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {

        int low = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            // Add current character
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Window invalid (> 2 distinct chars)
            while (map.size() > 2) {

                char leftChar = s.charAt(low);

                // Remove left character
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                low++;
            }

            // Update longest valid window
            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}
