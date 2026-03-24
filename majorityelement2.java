import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len=nums.length;
        if(len==0) return new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> res=new ArrayList<>();
        int threshold = len / 3;
        
        int i = 0;
        while (i < len) {
            int count = 1;
            int current = nums[i];
            
            while (i + 1 < len && nums[i + 1] == current) {
                count++;
                i++;
            }
           
            if (count > threshold) {
                res.add(current);
            }
            i++;
        }
        return res;
    }
}