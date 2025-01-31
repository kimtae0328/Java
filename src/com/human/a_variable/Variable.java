package com.human.a_variable;

// 1. 클래스 선언
public class Variable {
    // 전역변수 : 필드
    // 클래스 어디서나 사용가능한 변수
    // new 연산자를 만나서 생성될 때, 타입의 기본값으로 초기화
    int x = 1;

    public void var3(){
        // 지역변수 : 코드블럭 안에서만 사용할수 있는 변수
        // 초기화(메모리에 저장)를 하지 않으면 사용할수 없다
        
        int value;
        // int res = value + 10;
        int res1 = x + 10;

        // 변수의 값을 출력
        // 변수명만 입력
        // ""안에 입력하는것은 문자열로 인식
        System.out.println("res1");
        System.out.println(res1);

        res1 = 100;
        System.out.println("100으로 변경 : " + res1);
    }
    
    // 메서드
    public void method1(){

    }
    // 생성자
    public Variable(){

    }

    // 2. 메서드 선언
    public void var1() {
        // 타입 변수이름
        /*
         * int 정수
         * double 실수
         * char 하나의 문자
         */
        // 변수 : 값을 재사용 하기 위해 메모리에 지정
        // 변수 선언
        int x;
        // 변수 초기화 : 변수에 최초로 값이 저장될때 변수가 메모리에 생성
        // 값을 대입
        x = 10;

        // 변수 선언과 동시에 대입
        int y = 20;
        // 변수의 값을 출력하기 위해서 변수명을 이용
        System.out.println("x : " + x);
        System.err.println("y : " + y);
        System.out.println("x+y : " + x+y);
        System.err.println("x*y : " + x*y);
        System.out.println("x/y : " + x/y);
        System.out.println("x%y : " + x%y);
        // 여러개의 변수를 한번에 선언
        int a, b, c;

        // 값을 대입하지 않고 사용(출력)시 컴파일 오류 발생
        // System.out.println(a);

        // 변수값을 출력
        System.out.println("x : " + x);

        // 변수명 규칙
        /*
         * 첫번쨰 자리에는 숫자가 올수 없음
         * 소문자로 시작하고 단어가 연결될 경우
         * 연결되는 단어의 첫글자를 대문자로 작성 (약속)
         * 대소문자를 구분
         * 동일한 이름의 변수를 사용할 수 없음
         * 길이제한x
         * 저장값을 알기쉽게 이름짓기
         */
    }

    public void var2(){
        // 변수 x 선언 후 10 대입
        // 변수 y 선언 후 20 대입

        char[] x;
        // x의 값을 출력
        // System.out.println(x);
        char[] y;
        // y의 값을 출력
        // System.out.println(y);

        // x와 y의 합을 출력
        // System.out.println(x + y);
        // x와 y의 곱을 출력
    }

    /*
     * 구구단 출력
     */
    public void gugudan(){
        int x = 3;
        System.err.println(x+"단");        
        System.out.println(x + " * 1 = " + (x * 1));
        System.out.println(x + " * 2 = " + (x * 2));
        System.out.println(x + " * 3 = " + (x * 3));
        System.out.println(x + " * 4 = " + (x * 4));
        System.out.println(x + " * 5 = " + (x * 5));
        
        System.out.println("2단");
        System.out.println("2 * 1 = 2");
        System.out.println("2 * 2 = 4");
        System.out.println("2 * 3 = 6");
        System.out.println("2 * 4 = 8");
        System.out.println("2 * 5 = 10");
        System.out.println("2 * 6 = 12");
        System.out.println("2 * 7 = 14");
        System.out.println("2 * 8 = 16");
        System.out.println("2 * 9 = 18");

    }
}
