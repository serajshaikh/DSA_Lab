
import java.util.Stack; 
import java.util.Scanner; 
public class Test  
{ 
  
    static int evaluatePostfix(String exp) 
    { 
        
        Stack<Integer> stack=new Stack<>(); 
          
        
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 

            if(Character.isDigit(c)) 
            stack.push(c - '0'); 

            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 

                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
    } 
       
    public static void main(String[] args)  
    {      
        String s;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string.");
	s=scan.nextLine();
        System.out.println("postfix evaluation: "+evaluatePostfix(s)); 
    } 
} 
