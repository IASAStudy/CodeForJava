package ch8;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // ArithmeticException instance 생성
            System.out.println(4);
        } catch(ArithmeticException ae) { // instance of 로 검사, 즉 Exception e해도 OK!
            System.out.println("Exception Message: " + ae.getMessage()); // Exception instance에 저장된 메세지
            ae.printStackTrace(); // 예외발생 당시 call stack에 있었던 메서드의 정보와 예외 메세지를 화면에 출력
        }
        System.out.println(6);

        // ****멀티 catch 블럭 | 로 추가 가능
        // 단 조상-자손 관계는 X -> 불필요
    }
}
