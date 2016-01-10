  import java.io.*;
  import java.util.*;
  import java.text.*;
  import java.math.*;
  import java.util.regex.*;

  public class Solution {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int testCaseNum = sc.nextInt();
          for (int i = 0; i < testCaseNum; i++) {
              int a = sc.nextInt();
              int b = sc.nextInt();
              int n = sc.nextInt();
              int num = a;
              for (int j = 0; j < n; j++) {
                  num += b*Math.pow(2, j);
                  System.out.print(num + " ");
              }
              System.out.println();
          }
      }
  }