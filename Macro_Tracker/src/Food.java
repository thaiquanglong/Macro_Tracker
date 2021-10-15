import java.util.Scanner;

public class Food 
{   
    private static Scanner scan;
    private static SQL_QUERY command = new SQL_QUERY();
    public Food() {
    	if(!command.tableExists("FOOD_DATA")) {
    		String sql = "CREATE TABLE FOOD_DATA ( "+ 
    				"ID    INTEGER NOT NULL, " +
    				"NAME    TEXT NOT NULL, " +
    				"CAL    INTEGER NOT NULL, " +
    				"PRO    INTEGER NOT NULL, " +
    				"CARB    INTEGER NOT NULL, " +
    				"FAT    INTEGER NOT NULL, " +
    				"PRIMARY KEY(ID AUTOINCREMENT) );" ;
    		command.Query(sql);
    	}
    }
	//String name, int cal , int pro , int carb , int fat
    public static void addFood (){
    	
        scan = new Scanner(System.in);
        System.out.println("What is the name of your food?");
        String name = scan.nextLine();
        System.out.println("How many calories are in " + name +"?");
        int cal = scan.nextInt();
        System.out.println("How many grams of protein are in " + name +"?");
        int pro = scan.nextInt();
        System.out.println("How many grams of carbs are in " + name +"?");
        int carb = scan.nextInt();
        System.out.println("How many grams of fats are in " + name +"?");
        int fat = scan.nextInt();
        scan.nextLine();
        
        //Creating SQL string to add to table
        String sql = "INSERT INTO FOOD_DATA (NAME , CAL , PRO , CARB , FAT) "
                   + "VALUES ('" + name + "', " + cal + ", " + pro + ", " + carb + ", " + fat + " );";
        //Usr rechecks values
        System.out.println("Does this look correct?");
        System.out.println(name);
        System.out.println("Total calories " + cal);
        System.out.println("Total protein " + pro);
        System.out.println("Total carbs " + carb);
        System.out.println("Total fats " + fat);
        
        //Deciding if it looks correct to pass through
        System.out.println("If it looks correct type Y/y. If something needs to be changed type N/n");
        String usr = scan.nextLine();
        
        if(usr.equals("N") || usr.equals("n"))
        {
            //Not correct retry
            System.out.println("No worries. Lets try that again.");
            addFood();
            return;
        }
        command.Query(sql);
        System.out.println(name + " Successfully added.");  
    }
    
    public void close()
    {
        command.SQL_close();
    }
     
}
