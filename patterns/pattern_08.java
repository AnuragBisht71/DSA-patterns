package patterns;

import java.util.Scanner;

public class pattern_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scn.nextInt();

        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= n; j++) {
                
                if(i + j == n + 1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }
        scn.close();
    }
}

// Expected Output :-

//                    *
//               *
//          *
//     *
// *    