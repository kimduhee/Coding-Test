package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 * 출력
 * 1 4 2 3
 */
public class Test10871 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int num = Integer.parseInt(inputs[1]);
		int count = Integer.parseInt(inputs[0]);
		StringBuilder sb = new StringBuilder();
		
		String[] arr = br.readLine().split(" ");
		for(int i=0; i<count; i++) {
			if(Integer.parseInt(arr[i]) < num) {
				sb.append(arr[i]+" ");
			}
		}
		
		System.out.print(sb.toString());
	}

}
