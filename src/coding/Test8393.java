package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * �Է�
 * 3
 * ���
 * 6
 */
public class Test8393 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
