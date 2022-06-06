class Solution {
    public int maxProfit(int[] prices) {
		//create variable to store minimum price
        int minprice = Integer.MAX_VALUE;
		
		// create variable to store maxprofit
        int maxprofit =0;
        
		// calculate maxprofit
        for(int i=0;i<prices.length;i++){
			
			// find minimum price
            if(minprice>prices[i]){
                minprice = prices[i];
				
				//after finding mimum price 
				// calcualte maxprofit
            }else if((prices[i]-minprice)>maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        
        return maxprofit; // now, return maxprofit
    }
}