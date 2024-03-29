package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {


        /*수업목표. for문 단독 사용에 대한 흐음을 이해하고 적용할 수 있다.*/
        /*필기. [for 문 표현식]
         *  for (초기식; 조건식; 증감식;){
         *   조건을 만족하는 경우 수행할 구문(반복할 구문);
         *  }
         *  */


        /*필기. 1 부터 10까지 1씩 증가 시키면서(10번) i 값을 출력하는 기복 반복문*/

        for (int i = 1; i <= 10; i++) {          // 증감식을 쓰지 않으면 무한으로 1만 반복됨.
            System.out.println(i);              //  조건식 보다 초지식 수가 크면 출력되지 않음.
            // 조건식을 쓰지 않으면 무한 증가 된다.
        }


    }

    public void testForExample() {

        /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다.(1)*/

        /*필기. 5명의 학생 이름을 입력받아 이름을 출력해보자. */
        Scanner sc = new Scanner(System.in);
//        System.out.print("1번째 학생의 이름을 입력하세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1번째 학생의 이름은 = " + student1 + "입니다" );
//
//        System.out.print("2번째 학생의 이름을 입력하세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2번째 학생의 이름은 = " + student2 + "입니다" );
//
//        System.out.print("3번째 학생의 이름을 입력하세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3번째 학생의 이름은 = " + student3 + "입니다" );
//
//        System.out.print("4번째 학생의 이름을 입력하세요 : ");
//        String student4 = sc.nextLine();
//
//
//        System.out.println("5명의 학생 이름을 입력 받고 출력하는 기능 완료");


        /*필기.
         *   반복해야하는 내용 생각해보기.
         *  1. 안내문구 출력
         *  2. 학생의 이름을 입력 받아 변수 저장
         *  3. 저장된 이름을 출력
         * */


        /*필기.
         *   반복의 횟수는 1부터 5까지, 1씩 증가하면서 총 5번을 반복한다.
         * */

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번 째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번 째 학생의 이름은" + student + " 입니다.");

            // 스캔문을 조건문 안에 안넣는 이유는 반복문이 돌 때 마다 계속 메모리를 낭비하기 때문이다. (싱글톤?)

        }


    }

    public void testForExample2() {

        /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다.(2)*/
        /*필기.
         *  문장 속에서 규칙 찾기
         *  1~10까지의 합계를 구하시오.
         * */
        /* 필기. 1부터 5까지를 변수에 저장*/
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        /*필기. 결과를 누적시켜 담아줄 변수 선언*/
        int sum = 0;
        /*필기. sum에 변수의 값 하나씩 담기*/
        sum += num1; //sum= sum + num1
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        int sum2 = 0;
        for (int i = 1; i <= 5; i++) {
            sum2 += i;

        }
        System.out.println("sum2 = " + sum2); // 여기까지도 전부 다 더해져서 온다.


    }

    public void testForExample3() {

        /*수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다.(3)*/

        /*필기.
         *  5~10 사이의 난수를 발생시켜
         *  1부터 발생한 난수까지의 합계를 구해보자.
         * */
//        Math.random()* 숫자의 범위 + 시작 값
        int random = (int) (Math.random() * 6) + 5; // 랜덤이 실수인데 정수에 넣어주는거다 강제형변환.

        System.out.println("random = " + random);

        /*필기.뭔가 더해서 담기 위해 sum 변수를 0으로 초기화*/
        int sum = 0;

        if (random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;


        } else if (random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;

        } else if (random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;


        } else if (random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;


        } else if (random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;

        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;

        }

        System.out.println("1부터" + random +" 까지의 합은 " + sum);
        System.out.println("==============================");
        // 여기서 부터 제어문
        int sum2 = 0;
        for (int i = 1; i  <= random;i++){
            sum2 += i;

        }
        System.out.println("1부터" + random + "까지의 합은 : " + sum2);



    }
    public void testExample4(){
        /*필기.
        *   숫자 두 개를 입력 받아(Scanner) 작은 수에서 큰 수 까지의 합계를 구하세요
        *  단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다.*/

        /*필기. 정수 두 개 입력*/
        Scanner sc = new Scanner(System.in);
        System.out.print(" 첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print(" 두 번째 정수 입력 : ");
        int second = sc.nextInt();

        /*필기. 결과를 누적해서 담을 변수를 0 으로 초기화*/
        int sum = 0;

        if (first > second){
            for (int i = second; i <= first; i++){
               sum += i;

            }
        }else {
            for (int i = first; i <= second; i++){
                sum += i;

            }
        }
        System.out.println("sum = " + sum);

        /*필기.
        *  결국 작은 수 부터 시작해서 큰 수 까지의 합계를 구하는 것이기 때문에
        *  first 와 second 중 어느 것이 큰 수 인지 확인하면
        *  작은수 ~ 큰 수 까지의 합계를 구하는 로직으로 바꿀 수 있다.
        * */

        /*필기. 더 큰 값과 작은 값을 저장할 변수를 초기화 한다.*/

        int min = 0;
        int max = 0;

        if (first>second){

            max = first;
            min = second;

        }else {
            min = first;
            max = second;

        }
        int sum2 = 0;

        for (int i = min; i<= max; i++){
            sum2 += i;

        }
        System.out.println("sum2 = " + sum2);


    }

    public void printSimpleGugudan(){
        /*필기.
        *   키보드로 2~9 사이의 구구단을 입력받아
        *  2~9 사이인 경우 해당 단의 구구단을 출력하고.
        *  그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다" 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력하세요");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9 ){
            /*필기. 2~9 까지 입력한 경우 구구단 출력*/
//            System.out.println(dan + "*" + 1 + " = " + (dan * 1));
//            System.out.println(dan + "*" + 2 + " = " + (dan * 2));
//            System.out.println(dan + "*" + 3 + " = " + (dan * 3));
//            System.out.println(dan + "*" + 4 + " = " + (dan * 4));
//            System.out.println(dan + "*" + 5 + " = " + (dan * 5));
//            System.out.println(dan + "*" + 6 + " = " + (dan * 6));
//            System.out.println(dan + "*" + 7 + " = " + (dan * 7));
//            System.out.println(dan + "*" + 8 + " = " + (dan * 8));
//            System.out.println(dan + "*" + 9 + " = " + (dan * 9));

            for (int su = 1; su <= 9; su++){
                System.out.println(dan + " * " + su + " = " + (dan*su));

            }


        }else {
            System.out.println("반드시 2~9 사이의 양수를 입력하세요");
        }



    }




}
