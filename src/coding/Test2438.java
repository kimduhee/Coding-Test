package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 
 * 입력
 * 5
 * 출력
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Test2438 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int num = Integer.parseInt(input);
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}

}
