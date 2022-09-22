package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i=0;i<testCase;i++){
            int firstCab = scan.nextInt();
            int secondCab = scan.nextInt();

            if (firstCab < secondCab){
                System.out.println("FIRST");
            }else if (secondCab < firstCab){
                System.out.println("SECOND");
            }else {
                System.out.println("ANY");
            }
        }
    }
}
