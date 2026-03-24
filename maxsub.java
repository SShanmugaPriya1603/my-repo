import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int maxend=nums[0];
        int res=nums[0];
        int i;
        int len=nums.length;
        for(i=1;i<len;i++)
        {
           maxend=Math.max(nums[i],maxend+nums[i]);
           res=Math.max(maxend,res);
        }
        return res;
    }
}