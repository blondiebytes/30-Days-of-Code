    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String answer;
            if(n%2==1) {
                answer = "Weird";
            } else if (n >= 6 && n <= 20) {
                answer = "Weird";
            } else {
                answer = "Not Weird";
            }
            System.out.println(answer);
            
        }
    }