import java.io.IOException;
import java.util.Scanner;
public class InToPost 
{
   private Stack theStack;
   private String input;
   private String output = "";
   public InToPost(String in) 
   {
      input = in;
      int stackSize = input.length();
      theStack = new Stack(stackSize);
   }
   public String doTrans() 
   {
      for (int j = 0; j < input.length(); j++) 
      {
         char ch = input.charAt(j);
         switch (ch) 
         {
            case '+': 
            case '-':
               gotOper(ch, 1); 
               break; 
            case '*': 
            case '/':
               gotOper(ch, 2); 
               break;
            
            case '$':
            	gotOper(ch,3);
            	break;
             
            case '(': 
               theStack.push(ch);
               break;
            case ')': 
               gotParen(ch); 
               break;
            default: 
               output = output + ch; 
               break;
         }
      }
      while (!theStack.isEmpty()) 
      {
         output = output + theStack.pop();
      }
      System.out.println(output);
      return output; 
   }
   public void gotOper(char opThis, int prec1) 
   {
      while (!theStack.isEmpty()) 
      {
         char opTop = theStack.pop();
         if (opTop == '(') 
         {
            theStack.push(opTop);
            break;
         } 
         else 
         {
            int prec2;
            if (opTop == '+' || opTop == '-')
            prec2 = 1;


            
            else if(opTop == '*' || opTop == '/')
            prec2 = 2;
            else
            prec2 = 3;


            
            if (prec2 < prec1) 
            { 
               theStack.push(opTop);
               break;
            } 
            else output = output + opTop;
         }
      }
      theStack.push(opThis);
   }
   public void gotParen(char ch) 
   { 
      while (!theStack.isEmpty()) 
      {
         char chx = theStack.pop();
         if (chx == '(') 
         break; 
         else output = output + chx; 
      }
   }
   public static void main(String[] args) throws IOException 
   {
      String input ;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the infix expression");
      input=scan.nextLine();
      String output;
      InToPost ob = new InToPost(input);
      output = ob.doTrans(); 
      System.out.println("Postfix is " + output + '\n');
   }
   class Stack 
   {
      private int maxSize;
      private char[] stackArray;
      private int top;
      
      public Stack(int max) 
      {
         maxSize = max;
         stackArray = new char[maxSize];
         top = -1;
      }
      public void push(char j) 
      {
         stackArray[++top] = j;
      }
      public char pop() 
      {
         return stackArray[top--];
      }
      public char peek() 
      {
         return stackArray[top];
      }
      public boolean isEmpty() 
      {
         return (top == -1);
      }
   }
}
