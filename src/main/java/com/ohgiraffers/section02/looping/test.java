package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("숫자의 팩토리얼을 입력하세요 ");
    int dan = sc.nextInt();
    int sum = 1;

    for (int i =1; i<=dan; i++){

        sum *= i;

    }
    System.out.println("sum = " + sum);


        for (int i = 2; i <=100; i+=2){
            System.out.println(i);







}

        for (int i =7; i<=7; i++){
            for (int sum =1; sum<=9; sum++){
                System.out.println(i*sum);
            }

            for (int i = 10; i >0; i--) {
                System.out.println("i = " + i);

                for (int i=0; i<=23; i++){
                    for (int j = 0; j<=59; j++){
                        System.out.println(i+"시" + j + "분");
                    }
                }


}
            }
