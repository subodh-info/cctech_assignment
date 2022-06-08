class Solution {
    public int calculate(String s) {
        int len = s.length(); // length of string
        int result =0; // to store final result
        int current = 0; // to store the number from string expression
        int operation = 1; // to perform '+' or '-' operation
        Stack<Integer> stack = new Stack<Integer>(); // stack to store the digits
        
        for(int i=0;i<len;i++){ // iterate each character from string
            if(Character.isDigit(s.charAt(i))){ // check character is digit or not
                current = s.charAt(i) - '0'; // convert into digit from character
                
                // if more than one digits are available
                while((i+1)<len && (Character.isDigit(s.charAt(i+1)))){
                    // add and sotre all digits into variable 
                    current = current*10;
                    current = current + (s.charAt(i+1)-'0');
                    i++;
                }
                current = current * operation;
                result = result + current;
                current = 0;
            }
            else if(s.charAt(i)=='+'){
                operation = 1;
            }else if(s.charAt(i) == '-'){
                operation = -1;
            }
            else if(s.charAt(i) == '('){
                stack.push(result);
                stack.push(operation);
                result = 0;
                operation = 1;
            }
            else if(s.charAt(i)==')'){
                int prevOperation = stack.pop(); // pop the operation from stack
                result = prevOperation*result; // calculate the result
                int prevResult = stack.pop(); // pop the result from stack
                result = result + prevResult; // calculate the final result
            }
        }
        return result;
    }
}