package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Match;
import entities.Team;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		
		
		Team[] team = new Team[2];
		
		
		for (int i = 0; i < team.length; i++) {
			System.out.printf("Enter the name team %dº: ", i+1);
			String name = sc.nextLine();
			team[i] = new Team(name);
			
		}
			
		
		
		
		
		Random randomEvent = new Random();
		Random randomGoalRandom = new Random();
		
		Match match = new Match();
		List<String> eventsMatch = new ArrayList<String>(match.matchEvents());
		
		for (int i = 0; i < match.timeMatch; i++) {
			String events = eventsMatch.get(randomEvent.nextInt(eventsMatch.size()));
			
				if (events.equals("goal")) {
					int	resultGoal = randomGoalRandom.nextInt(2);
					team[resultGoal].goal += 1;
				}
			
			
			System.out.printf("|Minutes: %02d", i);
			System.out.printf(" | %-11s | %s[%d] x [%d]%s%n", events, team[0].name, team[0].goal, team[1].goal, team[1].name);
			
		}
		
		
		sc.close();

	}

}
