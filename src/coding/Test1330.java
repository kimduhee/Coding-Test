package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A가 B보다 큰 경우에는 '>'를 출력
 * A가 B보다 작은 경우에는 '<'를 출력
 * A와 B가 같은 경우에는 '=='를 출력
 */
public class Test1330 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
				
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}

}
