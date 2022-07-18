package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * 출력
 * Case #1: 2
 * Case #2: 5
 * Case #3: 7
 * Case #4: 17
 * Case #5: 7
 */
public class Test11021 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = Integer.parseInt(input);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<count; i++) {
			String[] inputs = br.readLine().split(" ");
			int m = Integer.parseInt(inputs[0]);
			int n = Integer.parseInt(inputs[1]);
			
			sb.append("Case #"+(i+1)+": " + (m+n) + "\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
