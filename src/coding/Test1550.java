package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 16���� ���� �Է¹޾Ƽ� 10������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * A
 * ���
 * 10
 */
public class Test1550 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		System.out.println(Integer.parseInt(input, 16));
	}
}
