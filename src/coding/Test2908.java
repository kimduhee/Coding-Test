package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
 * ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�
 * 734 893
 * ���
 * 437
 */
public class Test2908 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		
		inputs[0] = String.valueOf(inputs[0].charAt(2)) + String.valueOf(inputs[0].charAt(1)) + String.valueOf(inputs[0].charAt(0)); 
		inputs[1] = String.valueOf(inputs[1].charAt(2)) + String.valueOf(inputs[1].charAt(1)) + String.valueOf(inputs[1].charAt(0));
		
		if(Integer.parseInt(inputs[0]) > Integer.parseInt(inputs[1])) {
			System.out.print(inputs[0]);
		} else {
			System.out.print(inputs[1]);
		}
		
	}

}
