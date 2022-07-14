package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 5
 * 출력
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class Test2741 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		for(int i=1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
