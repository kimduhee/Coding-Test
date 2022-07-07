import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 
 * -------------------------
 * input 
 * 10
 * 
 * output
 * 3628800
 * -------------------------
 * input 
 * 0
 * 
 * output
 * 1
 * -------------------------
 */
public class Test10872 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		BigDecimal m = BigDecimal.ONE;
		int num = Integer.parseInt(input);
		
		for(int i=num; i>0; i--) {
			m = m.multiply(new BigDecimal(i));
		}
		
		System.out.println(m);
	}

}
