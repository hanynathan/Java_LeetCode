package practice;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoSumIIInputArrayIsSorted
{
    Logger logger = Logger.getLogger(getClass().getName());
    public int[] twoSum(int[] numbers, int target)
    {
        int low = 0;
        int high = numbers.length - 1;

        int sum = numbers[low] + numbers[high];

        while (sum != target && low < high)
        {
            if (sum > target)
            {
                high--;
            }else
            {
                low++;
            }
            sum = numbers[low] + numbers[high];
        }

        logger.log(Level.INFO, "sum is: {0}, [{1}, {2}]", new Object[] {sum, low + 1, high + 1});
        return new int[]{low + 1, high + 1};
    }

    public static void main(String[] args)
    {
//        int[] numbers = {2,7,11,15}; //[1,2]
//        int target = 9;

//        int[] numbers = {2,3,4}; //[1,3]
//        int target = 6;

        int[] numbers = {-1,0}; //[1,2]
        int target = -1;

        TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();
        twoSumIIInputArrayIsSorted.twoSum(numbers, target);
    }
}
