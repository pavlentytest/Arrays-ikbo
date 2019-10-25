package ru.pavlenty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] xx = new int[n];
        for(int i=0;i<xx.length;i++) {
            xx[i] = scan.nextInt();
        }
        for(int l : xx) {
            System.out.print(l + " ");
        }






            int j=0;
        for(int i=0;i<10;i++,j++) {
            System.out.println(i);
        }
        for(int i=10;i>0;i--) {
            if(1==1) continue;
        }
        int a=0;
        while(a>0) {
            if(1==1) break;
        }
        do {

        } while(false);


        // 0, 1, 2, 3
        int b[] = new int[5];
        int c[] = new int[5];
        // foreach
        for(int k : b) {
            System.out.println(k);
        }
        c[10] = 8;
        int[][] x = new int[3][4];
        int[][] cv = new int[4][4];


    }
}
