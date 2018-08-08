

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar kachow = new RaceCar("blue falcon",5);
		// 2. Print the RaceCar's position in the race
         System.out.println(kachow.getPositionInRace());
		// 3. Crash the RaceCar
		kachow.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
              kachow.isDamaged();
              kachow.pit();
		// 5. Help the car move into first place.
              int place = kachow.getPositionInRace();
            for(int i = 0; i < place; i++) {
              kachow.overtake();
            }

	}
}
