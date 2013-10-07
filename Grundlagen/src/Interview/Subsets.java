package Interview;

import java.util.ArrayList;

public class Subsets {


	public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){


		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size() == index){
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		}else{

			allsubsets = getSubsets(set, index + 1);
			int item = set.get(index);

			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();

			for(ArrayList<Integer> subset : allsubsets){
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset); //
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);

		}

		return allsubsets;
	}


	public Integer print(ArrayList<ArrayList<Integer>> alpha){
		for(ArrayList<Integer> subset : alpha){
			System.out.println(subset);
		}

		return null;

	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subsets obj = new Subsets();
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		//for(Integer subset : set){
		//	System.out.println(subset);
		//}

		ArrayList<ArrayList<Integer>> alpha =obj.getSubsets(set, 0);
		obj.print(alpha);


	}








}
