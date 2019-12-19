package ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // ArithmeticException instance 생성
            System.out.println(4);
        } catch(ArithmeticException ae) { // instance of 로 검사, 즉 Exception e해도 OK!
            System.out.println(5);
        }
        System.out.println(6);
        // try-catch 구문의 흐름을 살펴보자.

        // 그래서 특수한 예외를 catch로 처리한 후, 최종적으로 Exception e로 다시 catch구문을 추가해주어 완성한다.
    }
}
