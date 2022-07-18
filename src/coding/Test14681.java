package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. 
 * ��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. 
 * "Quadrant n"�� "��n��и�"�̶�� ���̴�.
 * ���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. 
 * �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
 * ���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
 *
 * �Է�
 * 12
 * 5
 * ���
 * 1
 * 
 */
public class Test14681 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();
		
		int x = Integer.parseInt(input1);
		int y = Integer.parseInt(input2);
		
		if(x>0) {
			//1 or 4
			if(y>0) {
				//1
				System.out.print("1");
			} else {
				//4
				System.out.print("4");
			}
		} else {
			//2 or 3
			if(y>0) {
				//2
				System.out.print("2");
			} else {
				//3
				System.out.print("3");
			}
		}
		
	}

}
