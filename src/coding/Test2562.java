package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 * 
 * 입력
 * 3
 * 29
 * 38
 * 12
 * 57
 * 74
 * 40
 * 85
 * 61
 * 출력
 * 85
 * 8
 *
 */
public class Test2562 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int num = 1;
		int max = 0;
		for(int i=1; i<10; i++) {
			input = br.readLine();
			
			if(Integer.parseInt(input) > max) {
				num = i;
				max = Integer.parseInt(input); 
			}
		}	
		
		System.out.println(max);
		System.out.println(num);
	}

}
