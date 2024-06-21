package practice;

import java.util.logging.*;

public class BestTimeToBuyAndSellStockII {
    Logger logger = Logger.getLogger(getClass().getName());
    boolean isHaveAStock = false;

    public int maxProfit(int[] prices)
    {
        //first is to buy when the price is low
        //the price is low when the next element is grater

        int myShare = 0;
        int totalProfit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            if(!isHaveAStock)
            {
                //buy
                myShare = toBuy(prices, i);

            } else if ((prices[i] < prices[i - 1] && isHaveAStock))
            {
                //sell
                totalProfit = totalProfit + (prices[i - 1] - myShare);
                isHaveAStock = false;
                //try to buy
                myShare = toBuy(prices, i);
            } else if (isHaveAStock && i == prices.length - 1 && myShare < prices[i])
            {
                totalProfit = totalProfit + (prices[i] - myShare);
                isHaveAStock = false;
            }
        }

        logger.log(Level.INFO, "maxProfit is: {0}", totalProfit);
        return totalProfit;
    }

    private int toBuy(int[] prices, int i)
    {
        int myShare = 0;
        if(i < prices.length - 1 && prices[i] < prices[i + 1])
        {
            //buy
            myShare = prices[i];
            isHaveAStock = true;
        }
        return myShare;
    }

    public static void main(String[] args)
    {
        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {1,2,3,4,5};
//        int[] prices = {7,6,4,3,1};
//        int[] prices = {2,1,2,0,1};
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII
                = new BestTimeToBuyAndSellStockII();

        bestTimeToBuyAndSellStockII.maxProfit(prices);
    }
}
