package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 5
 * 출력
 * 5
 * 4
 * 3
 * 2
 * 1
 */
public class Test2742 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		for(int i=num; i > 0; i--) {
			System.out.println(i);
		}
	}

}
