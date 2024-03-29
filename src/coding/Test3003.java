package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
 * 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
 * 입력
 * 0 1 2 2 2 7
 * 출력
 * 1 0 0 0 0 1
 */
public class Test3003 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int[] m = {1,1,2,2,2,8};
		for(int i=0; i<6; i++) {
			System.out.print(m[i] - Integer.parseInt(inputs[i]) + " ");
		}
	}

}
