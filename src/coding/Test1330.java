package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A�� B���� ū ��쿡�� '>'�� ���
 * A�� B���� ���� ��쿡�� '<'�� ���
 * A�� B�� ���� ��쿡�� '=='�� ���
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