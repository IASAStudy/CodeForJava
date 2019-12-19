package ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i<10; i++) {
            try {
                result = number/ (int)(Math.random() *10);
                System.out.println(result);
            } catch(ArithmeticException ae) {
                System.out.println("0");
            } // 비정상적인 프로그램 종료를 막는다.
        }
    }
}
