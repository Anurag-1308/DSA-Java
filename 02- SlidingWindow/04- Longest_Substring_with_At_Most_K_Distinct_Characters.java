/*
#Longest Substring with At Most K Distinct Characters
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:
low = 0
for(high = 0; high < n; high++){
    add current character to map
    while(map.size() > k){
        remove nums[low] from map
        low++
    }
    answer = max(answer, high - low + 1)
}

Key Idea:
Expand window.
If distinct characters exceed k,
shrink until valid again.

Complexity:
Time: O(n)
Space: O(k)
*/

Code:

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int low = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            // Add current character
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Window invalid (> k distinct chars)
            while (map.size() > k) {

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
