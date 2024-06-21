package practice;

import java.util.Arrays;
import java.util.logging.*;

public class RemoveDuplicatesfromSortedArrayII {
    Logger logger = Logger.getLogger(getClass().getName());

    public int removeDuplicates(int[] nums)
    {
        int k = 0;
        int elementDuplicateCount = 1;
        for (int num : nums)
        {
            if( k == 0 )
            {
                k++;
                continue;
            }
            if(num == nums[k - 1])
            {
                elementDuplicateCount++;
                if(elementDuplicateCount < 3)
                {
                    nums[k] = num;
                    k++;
                }

            }else
            {
                elementDuplicateCount = 1;
                nums[k] = num;
                k++;
            }
        }
        logger.log(Level.INFO, "k is: {0} & array elements are: {1}", new Object[] {k, Arrays.toString(nums)});
        return k;
    }

    public static void main(String[] args)
    {
//        int[] nums = {1,1,1,2,2,3};
//        int[] nums = {0,0,1,1,1,1,2,3,3};
//        int[] nums = {1};
//        int[] nums = {-1,0,0,0,0,3,3};
//        int[] nums = {-3,-1,0,0,0,3,3};
        int[] nums = {-3,-3,-2};
        RemoveDuplicatesfromSortedArrayII removeDuplicatesfromSortedArrayII
                = new RemoveDuplicatesfromSortedArrayII();
        removeDuplicatesfromSortedArrayII.removeDuplicates(nums);
    }
}
