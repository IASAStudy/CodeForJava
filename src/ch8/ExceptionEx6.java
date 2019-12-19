package ch8;

public class ExceptionEx6 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception();
    }

    // 메서드에 예외를 선언한다 : 자신이 발생할 가능성이 있는 예외를 전달하여 예외처리를 떠맡기는 것
    // 결국 main 메서드에서도 처리가 되지 않으면 프로그램이 종료되는 것.
    // 예외가 발생했을 때 Call Stack에 올라와있는 메서드 출력 - 위에서부터

    // JAVA API에 어떤 Exception을 throw해야 할지 나와있음.
}
