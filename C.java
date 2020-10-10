package com.company;

import java.util.Scanner;

public class C {
    int a, b, c,k,K,j;
    void m1(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }


    void m2(){
//        cvladi k shemovitane m5 is asamoqmedeblad
        k=a%10;
        System.out.println(k);
    }


    void m3(){
        while (b >=10)
//            cvladi k shemovitane m5 is asamoqmedeblad
            K=b/=10;
        System.out.println(K);
    }


    void m5(){
//        cvladi j shemovitane m6 is asamoqmedeblad
        j = k*K;

        System.out.println(j);
    }
    void m6(){
        System.out.println(K+j);
    }




}