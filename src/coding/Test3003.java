package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ü���� �� 16���� �ǽ��� ����ϸ�, ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8���� �����Ǿ� �ִ�.
 * �����̰� �߰��� ��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�
 * 0 1 2 2 2 7
 * ���
 * 1 0 0 0 0 1
 */
public class Test3003 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int[] m = {1,1,2,2,2,8};
		for(int i=0; i<6; i++) {
			System.out.print(m[i] - Integer.parseInt(inputs[i]) + " ");
		}
	}

}
