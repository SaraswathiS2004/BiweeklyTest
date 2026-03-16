package org.example.biweeklytest3;

public class MaximumProfit {

    public static int findMaximumProfit(int [] prices){
        int profit = 0;
        int buy = prices[0];
        for(int i = 1; i< prices.length; i++){
           int sell = prices[i];
           if(sell < buy){
               buy = sell;
           }
           else if((sell - buy) > profit){
               profit = sell - buy;
           }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices1 = {7,1,5,3,6,4};
        int profit1 = findMaximumProfit(prices1);
        System.out.println(profit1);
        int [] prices2 ={7,6,4,3,1};
        int profit2 = findMaximumProfit(prices2);
        System.out.println(profit2);
    }
}
