class Solution {
    public int maxProfit(int[] price) {
        int min_price = price[0];
        int maxpro = 0;

        for(int i=0; i< price.length; i++){
            if( price[i] < min_price ){ 
                min_price = price[i];
            }
            
            int curr_prof = price[i] - min_price;

            if(curr_prof > maxpro){
                maxpro = curr_prof;
            }
        }
        return maxpro;
    }
}