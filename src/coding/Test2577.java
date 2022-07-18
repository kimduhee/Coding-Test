package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 * 
 * 입력
 * 150
 * 266
 * 427
 * 출력
 * 3
 * 1
 * 0
 * 2
 * 0
 * 0
 * 0
 * 2
 * 0
 * 0
 */
public class Test2577 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int l = Integer.parseInt(input);
		input = br.readLine();
		int m = Integer.parseInt(input);
		input = br.readLine();
		int n = Integer.parseInt(input);
		
		int multiply = l*m*n;
		String multiplyStr =  String.valueOf(multiply);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<multiplyStr.length();j++) {
				if(String.valueOf(multiplyStr.charAt(j)).equals(String.valueOf(i))) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
