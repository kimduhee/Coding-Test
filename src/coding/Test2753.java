package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
 * 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
 * ������, 2000���� 400�� ����̱� ������ �����̴�.
 * 
 * �Է�
 * 2000
 * ���
 * 1
 * 
 * �Է�
 * 1999
 * ���
 * 0
 */
public class Test2753 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int yyyy = Integer.parseInt(input);

		if(yyyy%4 == 0 && (yyyy%100 != 0 || yyyy%400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}

}
