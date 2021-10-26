import java.util.Scanner;

public class SQLiteJDBC {
  private static Scanner input;
public static void main( String args[] ) {
	  user_prompt();
  }
  public static void user_prompt() {
		input = new Scanner(System.in);
		boolean exit_state = false;
		while (!exit_state) {
			boolean valid = false;
		
			System.out.println("Welcome to [enter name here]!");
			System.out.println("Please choose from the following options: ");
			System.out.println("Meal List (M)," +
								"\n"+ "Calorie Tracker (T)," +
								"\n"+ "Workout Regimen (W)," +
								"\n" + "Fitness Goals (F)," +
								"\n" + "Add Item Into Database (E)" +
								"\n" + "Search for Items in Database (S)");
			do{ 
				String selection = input.nextLine();		
		
				switch(selection){
					case "M":
					case "m":
						System.out.println("Here is the Meal List");
						// here there could be options for adding a meal or selecting an already added meal
						valid = true;
						break;
					case "T":
					case "t":
						System.out.println("Here is the Calorie Tracker");
						// here we could show calorie in-take and calories burned
						valid = true;
						break;
					case "W":
					case "w":
						System.out.println("Here is the Workout Regimen");
						// here we could have options for changing a regimen or checking work-out history
						valid = true;
						break;
					case "F":
					case "f":
						System.out.println("Here are your Fitness Goals");
						// I think this would be a note pad or checklist 
						valid = true;
						break;
					case "E":
					case "e":
						Table.addFood();
						// add food into the FOOD_DATA table in the database.
						valid = true;
						break;
					case "S":
					case "s":
						Table.search_for_food();
						// Search for food items by user's input. 
						valid = true;
						break;
					default:
						System.out.println("Invalid option input. Please try again.");	
						valid = false;
				}
			}while(valid == false);
			System.out.println("Do you want to exit the program ? Y/y to exit and N/n to go back to Options");
			do{ 
				String selection = input.nextLine();		
		
				switch(selection){
					case "Y":
					case "y":
						exit_state = true;
						valid = true;
						break;
					case "N":
					case "n":
						valid = true;
						break;
					default:
						System.out.println("Invalid option input. Please try again.");	
						valid = false;
				}
			}while(valid == false);
	        
		}
  	}
}