package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * 5
 * ���
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
