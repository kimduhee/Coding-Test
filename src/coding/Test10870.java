package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class Test10870 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int inputNum = Integer.parseInt(input);
		int[] inputArr = new int[21];
		inputArr[0] = 0;
		inputArr[1] = 1;
		
		for(int i=2; i<inputArr.length; i++) {
			inputArr[i] = inputArr[i-1] + inputArr[i-2];
		}
		
		System.out.println(inputArr[inputNum]);
	}

}
