package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ����
 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
 * 
 * �Է�
 * 5
 * ���
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Test2442 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(input);
		for(int i=1; i<m+1; i++) {
			int n = m-i;
			for(int j=0; j<n;j++) {
				sb.append(" ");
			}
			
			for(int k=0;k<2*i-1;k++) {
				sb.append("*");
			}
			
//			for(int j=0; j<n;j++) {
//				sb.append(" ");
//			}
			
			System.out.println(sb.toString());
			sb.setLength(0);

		}
	}
}
