package practice;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Candy {
    Logger logger = Logger.getLogger(getClass().getName());

    public int candy(int[] ratings)
    {
        int[] candyDistribution = new int[ratings.length];
        Arrays.fill(candyDistribution, 1);
        int minCandy = 0;

        for (int i = 1; i < ratings.length; i++)
        {
            if(ratings[i] > ratings[i - 1]){
                candyDistribution[i] = candyDistribution[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; --i)
        {
            if(ratings[i] > ratings[ i + 1])
            {
                candyDistribution[i] = Math.max(candyDistribution[i],  candyDistribution[i + 1] + 1);
            }
        }

        for (int candies : candyDistribution)
        {
            minCandy += candies;
        }
        logger.log(Level.INFO, "candy: {0}, candyDistribution: {1}", new Object[] {minCandy, Arrays.toString(candyDistribution)});
        return minCandy;
    }

    public static void main(String[] args)
    {
//        int[] ratings = {1,0,2}; //5
//        int[] ratings = {1,2,2}; //4
//        int[] ratings = {1,3,2,2,1}; //7
//        int[] ratings = {29,51,87,87,72,12}; //12
        int[] ratings = {1,3,4,5,2}; //11
        Candy candy = new Candy();
        candy.candy(ratings);
    }
}
