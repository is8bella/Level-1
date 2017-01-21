import java.util.ArrayList;

public class Netflix {
public static void main(String[] args) {
	//1. Instantiate some Movie objects (at least 5).
	Movie StarWars = new Movie("Star Wars VI", 4);
	Movie Bee = new Movie("Bee Movie", 3);
	Movie Minions = new Movie("Minions", 2);
	Movie Strange = new Movie("Doctor Strange", 4);
	Movie HomeAlone = new Movie("Home Alone 2: Lost in New York", 4);
	
	//2. Use the Movie class to get the ticket price of one of your movies.
	System.out.println("StarWars: " + StarWars.getTicketPrice());
	System.out.println("Bee Movie: " + Bee.getTicketPrice());
	System.out.println("Minions: " + Minions.getTicketPrice());
	System.out.println("Doctor Strange: " + Strange.getTicketPrice());
	System.out.println("Home Alone 2: " + HomeAlone.getTicketPrice());
	//3. Instantiate a NetflixQueue.
	NetflixQueue queue = new NetflixQueue();
		//4. Add your movies to the Netflix queue.
	queue.addMovie(StarWars);
	queue.addMovie(Bee);
	queue.addMovie(Minions);
	queue.addMovie(Strange);
	queue.addMovie(HomeAlone);
		//5. Print all the movies in your queue.
	queue.printMovies();
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
	System.out.println("The best movie is " + queue.getBestMovie());
	System.out.println("The second best movie is " + queue.getMovie(2));
}
}
