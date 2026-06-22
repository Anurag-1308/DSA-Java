/*
#Fruit Into Baskets
Pattern:
Sliding Window

Window Type:
Variable Size Window

Template:
low = 0
for(high = 0; high < n; high++){
    add fruit to map
    while(map.size() > 2){
        remove fruits[low]
        low++
    }
    answer = max(answer, high - low + 1)
}

Key Idea:
Window can contain
at most 2 fruit types.

Complexity:
Time: O(n)
Space: O(1)
*/

Code:

class Solution {
    public int totalFruit(int[] fruits) {

        int low = 0;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {

            // Add current fruit
            map.put(fruits[high],
                    map.getOrDefault(fruits[high], 0) + 1);

            // More than 2 fruit types
            while (map.size() > 2) {

                // Remove left fruit
                map.put(fruits[low],
                        map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }

                low++;
            }

            // Update maximum fruits collected
            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}
