package Recursion;

import java.util.Scanner;

public class recursion1 {

    //Problem-1:Basic
    //Print 1 to n
    static  int count = 0;
    static void print1ToN(){

        if ( count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        print1ToN();

    }


    void main() {
        Scanner sc = new Scanner(System.in);

        //Problem-1:Basic
        //Print 1 to n
        print1ToN();



    }
}
