package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * �Է�
 * 5
 * ���
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
