public class MEAL_DATA extends Food{
	private static String TABLE_NAME = "MEAL_DATA";
	private int ID;
	public MEAL_DATA() {
		super(TABLE_NAME);
	}
	public MEAL_DATA(int ID) {
		super(TABLE_NAME, ID);
	}
	public MEAL_DATA(Food new_food) {
		super(new_food);
	}
	public static MEAL_DATA typeToMEAL_DATA(Food food) {
		MEAL_DATA result = new MEAL_DATA(food);
		return result;
	}
	public static MEAL_DATA[] typeToMEAL_DATA(Food[] food) {
		MEAL_DATA[] result = new MEAL_DATA[food.length];
		for (int i =0; i < food.length; i++) {
			result[i] = MEAL_DATA.typeToMEAL_DATA(food[i]);
		}
		return result;
	}
	public static MEAL_DATA[] searching(String value_o_row) {
		return typeToMEAL_DATA(Food.searching(TABLE_NAME, value_o_row));
	}
    public String toString() {
        return "\n"
        		+ "***************************"  + "\n"
        		+"ID: "+ getID() + "\n"
        		+"Name: "+ getName() + "\n"
        		+"Calories: "+ getCalories() + "\n"	
        		+"Protein: "+ getProtein() + "\n"	
        		+"Carbs: "+ getCarbs() + "\n"
        		+"Sugars: "+ getSugars() + "\n"
        		+"Fiber: "+ getFiber() + "\n"
        		+"Fat: " + getFat()  + "\n"
        		+"***************************"  + "\n"
        		;
    }

}
