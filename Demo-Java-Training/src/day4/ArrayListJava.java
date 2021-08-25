package day4;

import java.util.*;
public class ArrayListJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String st = input.nextLine();
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i < n;i++) {
			st=input.nextLine();
			a.add(i,new ArrayList(Arrays.asList(st.split("\\s"))));
		}
		int q=input.nextInt();
		for(int i=0;i<q;i++) {
			int x=input.nextInt();
			int y=input.nextInt();
			if(x<=a.size() && y<a.get(x-1).size() && y>=0) {
				System.out.println(a.get(x-1).get(y));
			}
			else
				System.out.println("Error");
		}
	}
}