class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] people = {1,4,3};
		int[] seats = {1,5,3};
		int cars = sol.carsNeeded(people, seats);
		System.out.println(cars);
	}
}

class Solution {
	public int carsNeeded(int[] people, int[] seats){
		int carsNeeded = 0;
		int totalPassengers = 0;
		int totalSeats = 0;
		int maxSeats = 0;
		
		for (int i = 0; i < people.length; i++) {
			totalPassengers += people[i];
			totalSeats += seats[i];
			maxSeats = Math.max(maxSeats, seats[i]);
			
			if (totalSeats < totalPassengers || maxSeats < people[i]) {
				carsNeeded++;
				totalPassengers = people[i]; // Start counting new car with current passenger
				totalSeats = seats[i];       // Start counting new car with current seats
				maxSeats = seats[i];         // Reset maxSeats for new car
			}
		}
		
		return carsNeeded + 1;
//		int cars = 1;
//		int currCarCapacity = seats[0];
//		int currCar = 0;
//		for (int i = 0; i < people.length; i++) {
//			int peopleLeft = people[i];
//			if (currCarCapacity > peopleLeft){
//				currCarCapacity -= peopleLeft;
//			} else {
//				peopleLeft -= currCarCapacity;
//				if (peopleLeft == 0){
//					cars++;
//					currCar++;
//					currCarCapacity = seats[currCar];
//				}
//				while (peopleLeft > 0) {
//					cars++;
//					currCar++;
//					currCarCapacity = seats[currCar];
//					if (currCarCapacity > peopleLeft){
//						currCarCapacity -=  peopleLeft;
//						peopleLeft = 0;
//					} else if (currCarCapacity == peopleLeft){
//						peopleLeft = 0;
//						cars++;
//						currCar++;
//						currCarCapacity = seats[currCar];
//					} else {
//						peopleLeft -= currCarCapacity;
//					}
//				}
//			}
//		}
//		return cars;
	}
}