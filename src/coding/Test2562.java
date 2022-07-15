package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
