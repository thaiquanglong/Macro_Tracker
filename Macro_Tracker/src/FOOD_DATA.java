public class FOOD_DATA extends Food{
	private static String TABLE_NAME = "FOOD_DATA";
	private int ID;
	public FOOD_DATA() {
		super(TABLE_NAME);
	}
	public FOOD_DATA(int ID) {
		super(TABLE_NAME, ID);
	}
	public static FOOD_DATA[] searching(String value_o_row) {
		int[] result = new Food(TABLE_NAME).searching_by_value(value_o_row);
		FOOD_DATA[] result_food = new FOOD_DATA[result.length];
		for(int i = 0; i < result.length; i++) {
			result_food[i] = new FOOD_DATA(result[i]);
		}
		return result_food;
	}
	public void set_new_ID(int iD) {
		set_new_ID(ID, iD);
	}
	public void setName(String name) {
		setName(ID, name);
	}
	public void setDescription(String description) {
		setDescription(ID, description);
	}
	public void setCalories(double calories) {
		setCalories(ID, calories);
	}
	public void setProtein(double protein) {
		setProtein(ID, protein);
	}
	public void setCarbs(double carbs) {
		setCarbs(ID, carbs);
	}
	public void setSugars(double sugars) {
		setSugars(ID, sugars);
	}
	public void setFiber(double fiber) {
		setFiber(ID, fiber);
	}
	public void setFat(double fat) {
		setFat(ID, fat);
	}
	public void setFatty_acids_sat(double fatty_acids_sat) {
		setFatty_acids_sat(ID, fatty_acids_sat);
	}
	public void setFatty_acids_mon(double fatty_acids_mon) {
		setFatty_acids_mon(ID, fatty_acids_mon);
	}
	public void setFatty_acids_pol(double fatty_acids_pol) {
		setFatty_acids_pol(ID, fatty_acids_pol);
	}
	public void setCholesterol(double cholesterol) {
		setCholesterol(ID, cholesterol);
	}
	public void setRetinol(double retinol) {
		setRetinol(ID, retinol);
	}
	public void setVitamin_A(double vitamin_A) {
		setVitamin_A(ID, vitamin_A);
	}
	public void setCarotene_al(double carotene_al) {
		setCarotene_al(ID, carotene_al);
	}
	public void setCryptoxanthin(double cryptoxanthin) {
		setCryptoxanthin(ID, cryptoxanthin);
	}
	public void setCarotene_be(double carotene_be) {
		setCarotene_be(ID, carotene_be);
	}
	public void setLycopene(double lycopene) {
		setLycopene(ID, lycopene);
	}
	public void setLutein_with_zeaxanthin(double lutein_with_zeaxanthin) {
		setLutein_with_zeaxanthin(ID, lutein_with_zeaxanthin);
	}
	public void setThiamin(double thiamin) {
		setThiamin(ID, thiamin);
	}
	public void setRiboflavin(double riboflavin) {
		setRiboflavin(ID, riboflavin);
	}
	public void setNiacin(double niacin) {
		setNiacin(ID, niacin);
	}
	public void setVitamin_B6(double vitamin_B6) {
		setVitamin_B6(ID, vitamin_B6);
	}
	public void setFolic_acid(double folic_acid) {
		setFolic_acid(ID, folic_acid);
	}
	public void setFolate_food(double folate_food) {
		setFolate_food(ID, folate_food);
	}
	public void setFolate_DFE(double folate_DFE) {
		setFolate_DFE(ID, folate_DFE);
	}
	public void setFolate_total(double folate_total) {
		setFolate_total(ID, folate_total);
	}
	public void setCholine(double choline) {
		setCholine(ID, choline);
	}
	public void setVitamin_B12(double vitamin_B12) {
		setVitamin_B12(ID, vitamin_B12);
	}
	public void setVitamin_B12_added(double vitamin_B12_added) {
		setVitamin_B12_added(ID, vitamin_B12_added);
	}
	public void setVitamin_C(double vitamin_C) {
		setVitamin_C(ID, vitamin_C);
	}
	public void setVitamin_D(double vitamin_D) {
		setVitamin_D(ID, vitamin_D);
	}
	public void setVitamin_E(double vitamin_E) {
		setVitamin_E(ID, vitamin_E);
	}
	public void setVitamin_E_added(double vitamin_E_added) {
		setVitamin_E_added(ID, vitamin_E_added);
	}
	public void setVitamin_K(double vitamin_K) {
		setVitamin_K(ID, vitamin_K);
	}
	public void setCalcium(double calcium) {
		setCalcium(ID, calcium);
	}
	public void setPhosphorus(double phosphorus) {
		setPhosphorus(ID, phosphorus);
	}
	public void setMagnesium(double magnesium) {
		setMagnesium(ID, magnesium);
	}
	public void setIron(double iron) {
		setIron(ID, iron);
	}
	public void setZinc(double zinc) {
		setZinc(ID, zinc);
	}
	public void setCopper(double copper) {
		setCopper(ID, copper);
	}
	public void setSelenium(double selenium) {
		setSelenium(ID, selenium);
	}
	public void setPotassium(double potassium) {
		setPotassium(ID, potassium);
	}
	public void setSodium(double sodium) {
		setSodium(ID, sodium);
	}
	public void setCaffeine(double caffeine) {
		setCaffeine(ID, caffeine);
	}
	public void setTheobromine(double theobromine) {
		setTheobromine(ID, theobromine);
	}
	public void setAlcohol(double alcohol) {
		setAlcohol(ID, alcohol);
	}
	public void setWater(double water) {
		setWater(ID, water);
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
