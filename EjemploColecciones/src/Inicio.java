import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Inicio {

	public static void main(String[] args) {
		
		HashSet<String> arr1 = new HashSet<String>();
		arr1.add("Pepe1");
		arr1.add("Pepe");
		arr1.add("pepe");
		arr1.add("asda");
		arr1.add("asda");
		
		LinkedList<String> arr2 = new LinkedList<String>();
		arr2.add("Pepf");
		arr2.add("Pepe");
		arr2.add("Pepe");
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// System.out.println(arr1.get(0).hashCode()); get no funciona con HashSet.
		System.out.println(arr2.get(1).hashCode());
		System.out.println(arr2.get(2).hashCode());
		
		System.out.println(arr2.get(0).compareTo(arr2.get(1)));
		System.out.println("-------------");
		for (String a : arr1) {
			System.out.println(a);
		}
		
		Vector<Integer> col1 = new Vector<Integer>();
		ArrayList<Integer> col2 = new ArrayList<Integer>();
		LinkedList<Integer> col3 = new LinkedList<Integer>();
		HashSet<Integer> col4 = new HashSet<Integer>();
		TreeSet<Integer> col5 = new TreeSet<Integer>();
		col1.add(5);
		col1.add(1);
		col1.add(3);
		col1.add(4);
		col1.add(5);
		col1.add(2);
		for(int i : col1) {
			col2.add(i);
			col3.add(i);
			col4.add(i);
			col5.add(i);
		}
		System.out.println("-------------");
		
		System.out.print("col1: ");
		for(int i : col1) System.out.print(i + " ");
		System.out.println("");
		
		System.out.print("col2: ");
		for(int i : col2) System.out.print(i + " ");
		System.out.println("");
		
		System.out.print("col3: ");
		for(int i : col3) System.out.print(i + " ");
		System.out.println("");
		
		System.out.print("col4: ");
		for(int i : col4) System.out.print(i + " ");
		System.out.println("");
		
		System.out.print("col5: ");
		for(int i : col5) System.out.print(i + " ");
		System.out.println("");
		
	}

}
