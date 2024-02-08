package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class hahaha {

    public void testing(){

        /* 두 과목의 평균이 60점 이상이면 합격
         * 한 과목이라도 40점 미만이면 불합격
         *
         * 2과목에 대한 값을 입력 받고 합계와 평균을 이용하여 구하시오.
         * ex) 영어 30, 수학 90
         */


        System.out.println(" 두 과목의 점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);

        int eng = sc.nextInt();
        System.out.println("eng = " + eng);
        int mat = sc.nextInt();
        System.out.println("mat = " + mat);

//        int ave = (eng + mat) /2;

        if (eng >= 0 || mat >= 0) {
            if (eng < 40 || mat < 40) {
                System.out.println("불합격입니다.");
            } else if ((eng + mat)/ 2 >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("평균 60점 미만이다.");
            }
        }













    }
}
