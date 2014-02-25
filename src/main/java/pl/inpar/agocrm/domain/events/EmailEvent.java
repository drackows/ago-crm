package pl.inpar.agocrm.domain.events;

import java.io.File;
import java.util.Set;

public class EmailEvent extends AbstractEvent{

	String title;
	String body;
	Set<File> attachments;
	
}
