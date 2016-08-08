/* worked with LaTresha; however, we both went different routes
 * also got assistance from Lily and Shruti
 */
package Lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMovie {

	public static void main(String[] args) {
		
		ArrayList<Movie>list = new ArrayList<>();
		list.add(new Movie("Love Actually", "RomCom"));
		list.add(new Movie("When Harry Met Sally...", "RomCom"));
		list.add(new Movie("Crazy, Stupid, Love.", "RomCom"));
		list.add(new Movie("Frozen", "Disney"));
		list.add(new Movie("Lion King", "Disney"));
		list.add(new Movie("Mulan", "Disney"));
		list.add(new Movie("Snowpiercer", "Blow your Mind"));
		list.add(new Movie("Memento", "Blow your Mind"));
		list.add(new Movie("Inception", "Blow your Mind"));
		list.add(new Movie("Intersteller", "Blow your Mind"));
		
		Scanner scan1 = new Scanner(System.in);
		
		String choice = "y";
		
		System.out.println("Welcome to the Movie List Application!");
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("RomCom, Disney, Blow your Mind");
			System.out.println("What category are you interested in?");
			String input = scan1.nextLine();
			
			for (int i = 0; i < list.size(); i++){
				if (input.equalsIgnoreCase(list.get(i).getCategory())){
					System.out.println(list.get(i).getTitle());
				}
			}
				
			System.out.println("Continue? (y/n) ");
			choice = scan1.nextLine();
		
		}
	} 
}
