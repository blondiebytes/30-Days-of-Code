import java.io.*;
import java.util.*;


public class DecimalToBinary {

   public String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
   }


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int t=scanner.nextInt();
      for(int i=0;i<t;i++)
      {
           int decimal = scanner.nextInt();
           DecimalToBinary decimalToBinary = new DecimalToBinary();
           String binary = decimalToBinary.toBinary(decimal);
           System.out.println(binary);
      }
       

   }
}