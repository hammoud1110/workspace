package day03b;

import java.util.Calendar;



public class JavaBootCampParticipant extends Student{
private boolean subscribedToMailingList;
	
	public JavaBootCampParticipant(String firstName, String lastName, Calendar birthday, 
			int matriculationNr, String email, boolean subscribedToMailingList) {
		super(firstName, lastName, birthday, matriculationNr, email);
		this.subscribedToMailingList = subscribedToMailingList;
	}
	
	public boolean isSubscribedToMailingList() {
		return subscribedToMailingList;
	}

	public void setSubscribedToMailingList(boolean subscribedToMailingList) {
		this.subscribedToMailingList = subscribedToMailingList;
	}

	@Override
	public String toString() {
		return super.toString() + ", email: " + getEmail() + 
			", subscribed to mailing list: " + ((subscribedToMailingList) ? "yes" : "no");
	}
	
}
