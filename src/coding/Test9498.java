package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 90 ~ 100점은 A, 
 * 80 ~ 89점은 B, 
 * 70 ~ 79점은 C, 
 * 60 ~ 69점은 D, 
 * 나머지 점수는 F를 출력
 *
 */
public class Test9498 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int point = Integer.parseInt(input);
		String level = "";
		
		if(90 <= point && point <= 100) {
			level = "A";
		} else if(80 <= point && point <= 89) {
			level = "B";
		} else if(70 <= point && point <= 79) {
			level = "C";
		} else if(60 <= point && point <= 69) {
			level = "D";
		} else {
			level = "F";
		}
		
		System.out.print(level);
	}
}
