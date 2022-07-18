package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 * 
 * �Է�
 * 150
 * 266
 * 427
 * ���
 * 3
 * 1
 * 0
 * 2
 * 0
 * 0
 * 0
 * 2
 * 0
 * 0
 */
public class Test2577 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int l = Integer.parseInt(input);
		input = br.readLine();
		int m = Integer.parseInt(input);
		input = br.readLine();
		int n = Integer.parseInt(input);
		
		int multiply = l*m*n;
		String multiplyStr =  String.valueOf(multiply);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<multiplyStr.length();j++) {
				if(String.valueOf(multiplyStr.charAt(j)).equals(String.valueOf(i))) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
