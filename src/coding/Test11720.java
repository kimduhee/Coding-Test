package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 입력
 * 5
 * 출력
 * 54321
 *
 */
public class Test11720 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int m = Integer.parseInt(input);
		int result = 0;
		String input2 = br.readLine();
		for(int i=0; i<m;i++) {
			result += Integer.parseInt(String.valueOf(input2.charAt(i)));
		}
		System.out.println(result);
	}

}
