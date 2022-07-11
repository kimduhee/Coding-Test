package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDescAsc {

	static List<String> li = new ArrayList<String>();
	
	public static void dataSet() {
		li = new ArrayList<String>();
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		li.add("마");
	}
	
	public static void main(String[] args) {
		
		dataSet();
		
		System.out.print("랜덤 =>");
		Collections.shuffle(li);
		
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.println("Java 8 ------------------------------------");
		System.out.print("오름차순 =>");
		
		Collections.sort(li);
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.print("내림차순 =>");
		
		Collections.sort(li, Collections.reverseOrder());
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.println("Java 8 이후 --------------------------------");

		System.out.print("오름차순 =>");
		
		li.sort(Comparator.naturalOrder());
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.print("내림차순 =>");
		
		li.sort(Comparator.reverseOrder());
		for(String list: li) {
			System.out.print(list);
		}
		
	}
}
