package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * 
 * �Է�
 * 5
 * ���
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