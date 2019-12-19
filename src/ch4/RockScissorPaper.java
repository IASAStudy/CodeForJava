package ch4;
import java.util.*;

public class RockScissorPaper {
	public static void main(String[] args) {
		int user, com;
		
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");;
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp);
		
		com = (int)(Math.random()*3)+1;
		
		System.out.println("당신은 "+user+"입니다.");
		System.out.println("컴퓨터는"+com+"입니다.");
		
		switch(user - com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break; //break써도 되고 안써도 되고
		}
	}
}