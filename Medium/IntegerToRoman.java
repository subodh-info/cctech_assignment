class Solution {
    public String intToRoman(int num) {
        // store possible values into array for different roman digits
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // store all possible roman number into string format.
        String[] roman = {"M","CM","D","CD","C","XC", "L","XL","X","IX","V","IV","I"};
        
        String result =""; // this string is used to prodec result
        
        //Now, we convert the input number into Roman String
        for(int i=0;i<numbers.length;i++){
            
            // compare each number from array to input number
            while(num>=numbers[i]){
                // substract each time of possible value from numbers[] to input number
                num = num-numbers[i];
                result = result + roman[i];
            }
        }
        
        return result;
    }
}