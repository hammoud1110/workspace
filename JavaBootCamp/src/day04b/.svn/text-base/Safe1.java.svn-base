package day04b;

	
	
	
	
	
	

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;

	public class Safe1 {
	
		
		List<Secret> secretList = new ArrayList<Secret>();
		
		public Safe1(String secret) {
			secretList.add(new Secret(secret));
		}
		
		public void add(String secret) {
			secretList.add(new Secret(secret));
		}
		
		public Comparator<Secret> getComparator() {
			return new Comparator<Secret>() {

				@Override
				public int compare(Secret s1, Secret s2) {
					return s1.secretText.compareTo(s2.secretText);
				}
				
			};
		}
		
		class Secret {
			
			private String secretText;
			
			public Secret(String secretText) {
				this.secretText = secretText;
			}
			
		}

	}

	
	


