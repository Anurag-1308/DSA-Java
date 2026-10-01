/*
Maximum Subarray Sum with One Deletion (LC 1186)

Pattern:
Kadane's Algorithm — One Deletion

Template:
int noDelete = arr[0];
int oneDelete = 0;
int ans = arr[0];

for (int i = 1; i < arr.length; i++) {

    // Delete nahi kiya
    noDelete = Math.max(arr[i], noDelete + arr[i]);

    // Current element delete kiya ya pehle deletion use kiya
    oneDelete = Math.max(noDelete_old, oneDelete + arr[i]);

    ans = Math.max(ans, Math.max(noDelete, oneDelete));
}
return ans;

Key Idea:
noDelete -> current index tak max sum without deletion.
oneDelete -> current index tak max sum with at most one deletion.
At each element, choose:
1. Element ko include karo.
2. Current element ko delete karo.
3. Pehle se deletion use karke current element include karo.

Important:
- noDelete ka old value chahiye jab current element delete karna ho.
- Isliye update se pehle old noDelete save karna zaroori hai.
- All-negative array mein kam se kam ek element choose karna zaroori hai.

Complexity:
Time: O(n)
Space: O(1)
*/
Code:

class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = 0;
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {

            // Purana no-delete sum save karo
            int prevnodelete = nodelete;

            // Current element ke saath max sum
            nodelete = Math.max(nodelete + arr[i], arr[i]);

            // Current delete karo OR pehle hi delete kar chuke hain
            onedelete = Math.max(onedelete + arr[i], prevnodelete);

            // Overall maximum
            ans = Math.max(ans, Math.max(nodelete, onedelete));
        }

        return ans;
    }
}
