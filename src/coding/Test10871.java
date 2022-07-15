package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
