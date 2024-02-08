package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Test {

    public void testIf () {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */
        System.out.println("장 ㅇㅁㄴ입력해주세요");
        Scanner sc= new Scanner(System.in);

        double weight = sc.nextDouble();
        System.out.println("weight = " + weight);

        double height = sc.nextDouble() / 100;
        System.out.println("height = " + height);

        double bmi = ( weight / ( height * height));
        System.out.println("bmi = " + bmi);




        if (bmi <20 ) {
            System.out.println("당신은 저체중 이다.");

        } else if (bmi >=20 && 25 > bmi) {
            System.out.println("정상이비");
        }else  if (bmi >=25 && 30 > bmi){
            System.out.println("돼지");
        }else if (bmi >=30) {
            System.out.println("뚱뚱뚱보");
        }
    }
}
