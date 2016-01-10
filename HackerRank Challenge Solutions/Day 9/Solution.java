  import java.io.*;
  import java.util.*;
  import java.text.*;
  import java.math.*;
  import java.util.regex.*;

  public class Solution {
  
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          //Take Input
          int a = sc.nextInt();
          int b = sc.nextInt();
          int gcd=find_gcd(a,b);
          System.out.println(gcd);
      }
      static  int find_gcd(int a,int b){
          //Write the base condition
          if (a == b || b == 0) {
              return a;
          } else {
              return find_gcd(b,a%b);
          }
      }
  }