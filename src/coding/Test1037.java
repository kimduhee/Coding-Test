package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/******************************************8*******
 * ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, 
 * A�� 1�� N�� �ƴϾ�� �Ѵ�. 
 * � �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * �Է�
 * 2
 * 4 2
 * ���
 * 8
 */
public class Test1037 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int inputNum = Integer.parseInt(input);
		
		int[] inNum = new int[inputNum];

		String[] secondNum = br.readLine().split(" ");
		for(int i=0; i < secondNum.length;i++) {
			inNum[i] = Integer.parseInt(secondNum[i]);
		}
		
		Arrays.sort(inNum);
		int min = inNum[0];
		int max = inNum[secondNum.length-1];
		
		System.out.println(min * max);
		
	}

}
