package algorithems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	void swap(int [] s, int i, int j) {
		int temp = s[j];
		s[j] = s[i];
		s[i] = temp;
	}

	public void quickSort(int[] s) {
		int first;
		int last; ;
		int pivot = s.length / 2;

		boolean swapped = true;

		while (swapped) {
			swapped = false;
			first = 0;
			last = s.length - 1;
			while (first < last) {
				while (first < s.length-1 && s[first] < s[pivot]) {
					++first;
				}
				while (last > 0 && s[last] > s[pivot]) {
					--last;
				}
				if (first < last) {
					swapped = true;
					swap(s, first, last);
				}
			}

			if (swapped) {
				swap(s, first, pivot);
				pivot = first;
			}
		}
	}

	void printArray(int[] s){
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	public List<Integer> merge(List<Integer> a, List<Integer> b){
		int i = 0,j=0;
		ArrayList<Integer> c = new ArrayList<Integer>();
		while (i<a.size() && j<b.size()){
			if (a.get(i) > b.get(j) ){
				c.add(b.get(j++));
			}else {
				c.add(a.get(i++));
			}
		}
		
//		if (i >=a.size() && j <  b.size()){
			while (j<b.size()){
				c.add(b.get(j++));
				
			}
//		}
		
//		if (i< a.size() && j >=  b.size()){
			while (i<a.size()){
				c.add(a.get(i++));
			}
//		}
		
		return c;
		
//		int [] cOutout = new int[c.size()];
//		for (i = 0; i < c.size(); i++) {
//			cOutout[i] = c.get(i);
//		}
//		return cOutout;


	}

	public List<Integer> mergeSort(List<Integer> s){
		if (s.size() >1){
			java.util.List<Integer> l = mergeSort(s.subList(0, s.size()/2) );
			java.util.List<Integer> r = mergeSort(s.subList(s.size()/2, s.size()) );
			return merge(l, r);
		}else{
			return s;
		}
	}

	public static void main(String[] args) {
		Sort test = new Sort();
//		int[] s = {2,7,30,10,50,0,80,20,77,5,1,22};
//		test.quickSort(s);
//		test.printArray(s);
	List <Integer> liste = new ArrayList<>(Arrays.asList(2,7,30,10,50,0,80,20,77,5,1,22));
	List <Integer> liste2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	System.out.println(liste.subList(0, liste.size()/2));
	System.out.println(liste.subList(liste.size()/2, liste.size()));
		System.out.println(test.mergeSort(liste));
		System.out.println(test.mergeSort(liste2));
	}

}
