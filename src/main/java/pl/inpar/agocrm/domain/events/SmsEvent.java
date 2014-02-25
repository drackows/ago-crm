package pl.inpar.agocrm.domain.events;

public class SmsEvent extends AbstractEvent{
	
	Integer phoneNumber;
	Boolean incoming;
	String text;
	
}
