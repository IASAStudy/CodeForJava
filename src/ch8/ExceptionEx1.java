package ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        // RuntimeExcepton - 프로그래머의 실수
        // 배열의 범위를 넘어섬
        // null인 참조변수를 호출하려 함
        // 클래스간의 형변환이 잘못됨
        // 0으로 나누려 함

        // Exception - 사용자의 잘못된 사용
        // 존재하지 않는 파일 입력
        // 클래스의 이름을 잘못 입력
        // 데이터 형식이 잘못됨

        try {
            try{    } catch(Exception e) {}
        } catch(Exception e) {
            try{    } catch(Exception e1) {} // 이름을 다르게 해줘야 구분이 됨.
        }
    }
}
