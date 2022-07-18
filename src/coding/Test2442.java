package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 * 별은 가운데를 기준으로 대칭이어야 한다.
 * 
 * 입력
 * 5
 * 출력
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
