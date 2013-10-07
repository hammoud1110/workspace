package day04b;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import day04b.Safe1.Secret;

public class Safe {

	List<Secret> secretList = new  ArrayList<Secret>();
	
	
	public Safe(String secret){
		secretList.add(new Secret(secret));
	}
	
	
	public void add(String secret) {
		secretList.add(new Secret(secret));
	}
	
	
	public Comparator<Secret> getComparator(){
		
		
		return new Comparator<Safe.Secret>() {

			@Override
			public int compare(Secret s1, Secret s2) {
				// TODO Auto-generated method stub
				return s1.secretText.compareTo(s2.secretText);
			}
		};
	}
	
	
	
	
	public class Secret{
		
		
		private String secretText;
		public Secret(String secret){
			this.secretText = secret;
		}
	}
	
	
	
}
