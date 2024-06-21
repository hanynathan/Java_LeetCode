package practice;

import java.util.Arrays;
import java.util.logging.*;

public class RemoveDuplicatesfromSortedArray {
    Logger logger = Logger.getLogger(getClass().getName());
    public int removeDuplicates(int[] nums)
    {
        int k = 1;
//        for (int i = 1; i <= nums.length - 1; i++)
//        {
//            cur = nums[i];
//            prev = nums[i - 1];
//            if (cur != prev)
//            {
//                nums[k] = cur;
//                k++;
//            }
//        }

        for (int num : nums){
            if(num != nums[k - 1]){
                nums[k] = num;
                k++;
            }
        }
        logger.log(Level.INFO, "k: {0}, nums: {1}", new Object[] {k, Arrays.toString(nums)});
        return k;
    }

    public static void main(String[] args)
    {
//        int[] nums = {1,1,2};
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1};
//        int[] nums = {-1,0,0,0,0,3,3};
//        int[] nums = {-3,-1,0,0,0,3,3};
        int[] nums = {-3,-3,-2};
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray
                = new RemoveDuplicatesfromSortedArray();
        removeDuplicatesfromSortedArray.removeDuplicates(nums);
    }
}
