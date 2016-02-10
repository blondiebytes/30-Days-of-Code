import java.util.*;
import java.io.*;
class Calculator{

    
       static int power(int n1,int n2) throws Exception
        {
            int pow;
            pow=(int)Math.pow(n1,n2);      
            
            if(n1<0 || n2<0){
                 throw new Exception("n and p should be non-negative");  
            }else{
              return pow;
            }
            
                
        }
}
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}