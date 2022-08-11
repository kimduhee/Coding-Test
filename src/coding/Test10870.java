package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
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
