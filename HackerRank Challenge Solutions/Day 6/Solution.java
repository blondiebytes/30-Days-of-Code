  import java.io.*;
  import java.util.*;
  import java.text.*;
  import java.math.*;
  import java.util.regex.*;

  public class Solution {

      // 012345
      // -----#
      // ----##
    
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int height = sc.nextInt();
          for (int level = 1; level <= height; level++) {
            for (int step = 0; step < level; step++) {
                  if (step == 0) {
                      for (int k = 0; k < height - level; k++) {
                          System.out.print(" ");
                      }
                  }
                  System.out.print("#");
                }
              System.out.println();
            }
        }
  }