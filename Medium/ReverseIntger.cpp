class Solution {
public:
    int reverse(int x) {
        // check range for x
        // if is out of integer range then return 0;
        if(x>=2147483647 || x<=-2147483648){
            return 0;
        }
        
        int rem;
        long int result=0;
        int temp;
        //check x is positive of negative
        if(x<0){
            temp = -1*x;
            while(temp!=0){
                rem = temp%10; // get the remainder of number
                
                result = result*10;
                if(result>=2147483647 || result<=-2147483648){ // check the range for result
                    return 0;
                }
                result = result + rem; 
                temp = temp/10;
            }
            result = -1*result;
        }else{
            temp = x;
            while(temp!=0){
                rem = temp%10; // get the remainder of number
                
                result = result*10;
                if(result>=2147483647 || result<=-2147483648){ // check the range for result
                    return 0;
                }
                result = result + rem; 
                temp = temp/10;
            }
        }
        return (int)result;
    }
};