package entities;

import java.util.ArrayList;
import java.util.List;

import application.Program;

public class Match {
	
	public int timeMatch = 90;
	
	
	String[] events = {"goal", "foul", "yellow card","red card", "normal game"};
	int[] chance = {2, 25, 4, 1, 58};
	
	
	public List<String> matchEvents() {
		
		List<String> matchProbability = new ArrayList<String>();
		
		for (int i = 0; i < events.length; i++) {
			for (int j = 0; j < chance[i]; j++) {
				matchProbability.add(events[i]);
			}
		}
		
		return matchProbability;
		
	}
	
	
	
	
	
}
