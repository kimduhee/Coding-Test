package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDescAsc {

	static List<String> li = new ArrayList<String>();
	
	public static void dataSet() {
		li = new ArrayList<String>();
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
	}
	
	public static void main(String[] args) {
		
		dataSet();
		
		System.out.print("���� =>");
		Collections.shuffle(li);
		
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.println("Java 8 ------------------------------------");
		System.out.print("�������� =>");
		
		Collections.sort(li);
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.print("�������� =>");
		
		Collections.sort(li, Collections.reverseOrder());
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.println("Java 8 ���� --------------------------------");

		System.out.print("�������� =>");
		
		li.sort(Comparator.naturalOrder());
		for(String list: li) {
			System.out.print(list);
		}
		
		System.out.println("");
		System.out.print("�������� =>");
		
		li.sort(Comparator.reverseOrder());
		for(String list: li) {
			System.out.print(list);
		}
		
	}
}
