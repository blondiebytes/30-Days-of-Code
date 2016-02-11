import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic{
    
    
  public  int divisorSum(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            
            if(n%i==0){
                result+=i;
            }
            
        }
        return result;
        
    }
    
    
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}