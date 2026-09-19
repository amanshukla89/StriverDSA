package Recursion;

import java.util.Scanner;

public class recursion2 {

    //Problem-2 :Using Two Parameters
    //Print Name n times
    //TC:O(N)
    //SC:O(N)
    static void printName(int i,int n) {
        //Base case
        if ( i > n) {
            return;
        }
        System.out.println("Hello World");
        printName(i+1,n);
    }

    //Problem-3 :Using Two Parameters
    //Print number 1 to n times
    //TC:O(N)
    //SC:O(N)
    static void print1ToN(int i,int n){
        //base case
        if(i > n){
            return;
        }
        System.out.print(i + " ");
        print1ToN(i+1,n);
    }

    //Problem-4:Using two parameters
    //Print N to 1
    //TC:
    //SC:
    static void printNTo1(int i,int n) {
        //Base Case
        if( i <= n){
            return;
        }
        System.out.print(i + " ");
        printNTo1(i-1,n);
    }

    //Problem-5:Using Two parameters
    //Print 1 to N:
    //Backtracking-Using function call before print
    //TC:
    //SC:
    static void print1ToN2(int i,int n) {
        //Base Case
        if( i < 1) {
            return;
        }
        print1ToN2(i-1,n);
        System.out.print(i + " ");
    }

    //Problem-6:Using Two parameters
    //Print N to 1:
    //Backtracking-Using function call before print
    //TC:
    //SC:
    static void printNTo12(int i,int n) {
        //base case
        if (i > n) {
            return;
        }
        printNTo12(i+1,n);
        System.out.print(i + " ");
    }


    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int z = sc.nextInt();

        //Problem-6:Using Two parameters
        //Print N to 1:
        //Backtracking-Using function call before print
        printNTo12(1,z);

        //Problem-5:Using Two parameters
        //Print 1 to N:
        //Backtracking-Using function call before print
        //print1ToN2(z,z);

        //Problem-4:Print from N to 1
        //Print N to 1
        //printNTo1(z,0);

        //Problem-3 :Using Two Parameters
        //Print number 1 to n times
        //print1ToN(1,z);

        //Problem-2:Using Two Parameters
        //Print Name 5 times
        //printName(1,z);


    }
}
