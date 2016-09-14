package assignmenttwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AssignmentTwo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Aman");
		al.add("Rajni");
		al.add("Mohan");
		al.add("Rajat");
		al.add("Aman");
		al.add("Shrey");
		al.add("Aman");
		al.add("Rajat");

		Iterator<String> iter = al.iterator();
		System.out.println("Collection With Duplicates:");
		System.out.print("{ ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("}");
		System.out.println("*****************************************");

		Set<String> hs = new LinkedHashSet<String>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);

		Iterator<String> iters = al.iterator();
		System.out.println("Collection Without Duplicates:");
		System.out.print("{ ");
		while (iters.hasNext()) {
			System.out.print(iters.next() + " ");
		}
		System.out.print("}");

	}

}
