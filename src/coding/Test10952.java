package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * 0 0
 * 출력
 * 2
 * 5
 * 7
 * 17
 * 7
 */
public class Test10952 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String[] inputs = br.readLine().split(" ");
			
			int m = Integer.parseInt(inputs[0]);
			int n = Integer.parseInt(inputs[1]);
			
			if(m == 0 && n == 0) {
				break;
			}
			
			sb.append(m+n).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
