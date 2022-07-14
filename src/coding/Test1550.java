package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * A
 * 출력
 * 10
 */
public class Test1550 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		System.out.println(Integer.parseInt(input, 16));
	}
}
