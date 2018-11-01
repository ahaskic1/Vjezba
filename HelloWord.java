package com.haskic.vjezba;

import java.util.Scanner;

public class HelloWord {

    public static void main(String[] args) {
        int n;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n=ulaz.nextInt();
        for(int i=1;i<=n;i++)
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(",");
            }

	// write your code here
    }
}
