package teams;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int people = 0;
		int cik;
		String names = "";

		System.out.println("Do you want?");
		System.out.println("1) two persons in team");
		System.out.println("2) two teams");

		cik = sc.nextInt();

		System.out.println("How many peopple are going to play? ");

		people = sc.nextInt();
		sc.nextLine();

		// checking if players are even
		if (!(people % 2 == 0)) {
			System.out.println("Players need to be even number");
			System.exit(0);
		}

		ArrayList<String> players = new ArrayList<String>();

//loop for collecting player names
		for (int i = 0; i <= people - 1; i++) {
			System.out.println("Enter " + (i + 1) + ". persons name.");
			names = sc.next();
			players.add(names);
		}

		Random rand = new Random();
		switch (cik) {

		case (1):

			try {
				while (players.size() >= 0) {
					int cip = rand.nextInt(players.size());
					System.out.print(players.get(cip) + " is with in the team with  ");
					players.remove(cip);
					int cip2 = rand.nextInt(players.size());
					System.out.print(players.get(cip2));
					players.remove(cip2);
					System.out.println();

				}
			} catch (Exception ex) {
				System.out.println("Something went wrong!");
			}

		case (2):
			try {
				System.out.println("Team 1:");
				for (int i = 0; i <= (players.size() / 2) + 1; i++) {
					int cip = rand.nextInt(players.size());
					System.out.println(players.get(cip));
					players.remove(cip);
				}

				System.out.println("Team 2:");
				for (int i = 0; i <= (players.size() / 2) + 1; i++) {
					int cip = rand.nextInt(players.size());
					System.out.println(players.get(cip));
					players.remove(cip);
					if (players.size() == 1) {
						System.out.println(players.get(0));
					}
				}

				sc.close();
			} catch (Exception ex) {
				System.out.println("Something went wrong!");
			}
		}

	}

}
