package practice;

import java.util.Arrays;
import java.util.logging.*;

public class MergeSortedArray {
    Logger logger = Logger.getLogger(getClass().getName());

    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int finalSize = m + n - 1;
        int[] finalResult = new int[m + n];
        if (m == 0)
        {
            finalResult = nums2;
        } else if (n == 0)
        {
            finalResult = nums1;
        } else
        {
            int i = m - 1;
            int j = n - 1;
            while (finalSize >= 0)
            {
                if (i >= 0 && j >= 0)
                {
                    if (nums1[i] > nums2[j])
                    {
                        finalResult[finalSize--] = nums1[i--];
                    } else
                    {
                        finalResult[finalSize--] = nums2[j--];
                    }
                } else if (i >= 0)
                {
                    finalResult[finalSize--] = nums1[i--];
                } else if (j >= 0)
                {
                    finalResult[finalSize--] = nums2[j--];
                } else
                {
                    break;
                }
            }
        }

        nums2 = finalResult;

        String finalResultString = Arrays.toString(finalResult);
        String finalNums2 = Arrays.toString(nums2);
        logger.log(Level.INFO, "finalResult: {0}, nums2: {1}", new Object[] {finalResultString, finalNums2});
    }

    public static void main(String[] args)
    {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        //Example 1:
        int[] first = {1, 2, 3, 0, 0, 0};
        int[] second = {2, 5, 6};
        mergeSortedArray.merge(first, 3, second, 3);

        //Example 2:
//        int[] first = {1};
//        int[] second = {};
//        mergeSortedArray.merge(first, 1, second, 0);

        //Example 3:
//        int[] first = {0};
//        int[] second = {1};
//        mergeSortedArray.merge(first, 0, second, 1);
    }
}