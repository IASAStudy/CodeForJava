package ch8;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생"); // Exception클래스의 생성자 하나를 알 수 있겠죠?
            throw e;
            // throw new Exception("고의로 발생") 과 같음
        } catch(Exception e) {
            System.out.println("에러 메세지: "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
