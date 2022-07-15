package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test10950 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num; i++) {
			String arr[] = br.readLine().split(" ");
			sb.append(Integer.parseInt(arr[0].toString()) + Integer.parseInt(arr[1].toString())+"\n");
		}
		System.out.print(sb.toString());
	}

}
