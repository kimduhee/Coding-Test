package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/******************************************8*******
 * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, 
 * A가 1과 N이 아니어야 한다. 
 * 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 2
 * 4 2
 * 출력
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
