import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Food {
	private String TABLE_NAME;
	private int ID;
	private String Name;
	private String Description;
	private double Calories;
	private double Protein;
	private double Carbs;
	private double Sugars;
	private double Fiber;
	private double Fat;
	private double Fatty_acids_sat;
	private double Fatty_acids_mon;
	private double Fatty_acids_pol;
	private double Cholesterol;
	private double Retinol;
	private double Vitamin_A;
	private double Carotene_al;
	private double Carotene_be;
	private double Cryptoxanthin;
	private double Lycopene;
	private double Lutein_with_zeaxanthin;
	private double Thiamin;
	private double Riboflavin;
	private double Niacin;
	private double Vitamin_B6;
	private double Folic_acid;
	private double Folate_food;
	private double Folate_DFE;
	private double Folate_total;
	private double Choline;
	private double Vitamin_B12;
	private double Vitamin_B12_added;
	private double Vitamin_C;
	private double Vitamin_D;
	private double Vitamin_E;
	private double Vitamin_E_added;
	private double Vitamin_K;
	private double Calcium;
	private double Phosphorus;
	private double Magnesium;
	private double Iron;
	private double Zinc;
	private double Copper;
	private double Selenium;
	private double Potassium;
	private double Sodium;
	private double Caffeine;
	private double Theobromine;
	private double Alcohol;
	private double Water;
    private static SQL_QUERY command = new SQL_QUERY();
    private static Table table;
    public Food(String table_name) {
    	table = new Table(table_name);
    	TABLE_NAME = table_name;
    }
    public Food(String table_name, int row_ID) {
    	table = new Table(table_name);
    	TABLE_NAME = table_name;
    	get_table_by_ID(row_ID);
    }
    
    public void close()
    {
        command.SQL_close();
    }
	private void get_table_by_ID(int value) {
    	ResultSet data = command.get_data_from_row(TABLE_NAME, String.valueOf(value), "ID");
    	try {
			ID = data.getInt(1);
			Name = data.getString(2);
			Description = data.getString(3);
			Calories = Double.parseDouble(Float.toString(data.getFloat(4)));
			Protein = Double.parseDouble(Float.toString(data.getFloat(5)));
			Carbs = Double.parseDouble(Float.toString(data.getFloat(6)));
			Sugars = Double.parseDouble(Float.toString(data.getFloat(7)));
			Fiber = Double.parseDouble(Float.toString(data.getFloat(8)));
			Fat = Double.parseDouble(Float.toString(data.getFloat(9)));
			Fatty_acids_sat = Double.parseDouble(Float.toString(data.getFloat(10)));
			Fatty_acids_mon = Double.parseDouble(Float.toString(data.getFloat(11)));
			Fatty_acids_pol = Double.parseDouble(Float.toString(data.getFloat(12)));
			Cholesterol = Double.parseDouble(Float.toString(data.getFloat(13)));
			Retinol = Double.parseDouble(Float.toString(data.getFloat(14)));
			Vitamin_A = Double.parseDouble(Float.toString(data.getFloat(15)));
			Carotene_al = Double.parseDouble(Float.toString(data.getFloat(16)));
			Carotene_be = Double.parseDouble(Float.toString(data.getFloat(17)));
			Cryptoxanthin = Double.parseDouble(Float.toString(data.getFloat(18)));
			Lycopene = Double.parseDouble(Float.toString(data.getFloat(19)));
			Lutein_with_zeaxanthin = Double.parseDouble(Float.toString(data.getFloat(20)));
			Thiamin = Double.parseDouble(Float.toString(data.getFloat(21)));
			Riboflavin = Double.parseDouble(Float.toString(data.getFloat(22)));
			Niacin = Double.parseDouble(Float.toString(data.getFloat(23)));
			Vitamin_B6 = Double.parseDouble(Float.toString(data.getFloat(24)));
			Folic_acid = Double.parseDouble(Float.toString(data.getFloat(25)));
			Folate_food = Double.parseDouble(Float.toString(data.getFloat(26)));
			Folate_DFE = Double.parseDouble(Float.toString(data.getFloat(27)));
			Folate_total = Double.parseDouble(Float.toString(data.getFloat(28)));
			Choline = Double.parseDouble(Float.toString(data.getFloat(29)));
			Vitamin_B12 = Double.parseDouble(Float.toString(data.getFloat(30)));
			Vitamin_B12_added = Double.parseDouble(Float.toString(data.getFloat(31)));
			Vitamin_C = Double.parseDouble(Float.toString(data.getFloat(32)));
			Vitamin_D = Double.parseDouble(Float.toString(data.getFloat(33)));
			Vitamin_E = Double.parseDouble(Float.toString(data.getFloat(34)));
			Vitamin_E_added = Double.parseDouble(Float.toString(data.getFloat(35)));
			Vitamin_K = Double.parseDouble(Float.toString(data.getFloat(36)));
			Calcium = Double.parseDouble(Float.toString(data.getFloat(37)));
			Phosphorus = Double.parseDouble(Float.toString(data.getFloat(38)));
			Magnesium = Double.parseDouble(Float.toString(data.getFloat(39)));
			Iron = Double.parseDouble(Float.toString(data.getFloat(40)));
			Zinc = Double.parseDouble(Float.toString(data.getFloat(41)));
			Copper = Double.parseDouble(Float.toString(data.getFloat(42)));
			Selenium = Double.parseDouble(Float.toString(data.getFloat(43)));
			Potassium = Double.parseDouble(Float.toString(data.getFloat(44)));
			Sodium = Double.parseDouble(Float.toString(data.getFloat(45)));
			Caffeine = Double.parseDouble(Float.toString(data.getFloat(46)));
			Theobromine = Double.parseDouble(Float.toString(data.getFloat(47)));
			Alcohol = Double.parseDouble(Float.toString(data.getFloat(48)));
			Water = Double.parseDouble(Float.toString(data.getFloat(49)));
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
    }
	public int[] searching_by_value(String value_o_row) {
		ArrayList<Integer> IDs = new ArrayList<Integer>();
		ResultSet temp = command.search_name_n_des(TABLE_NAME, value_o_row);
		try {
			while (temp.next()) { 
			    IDs.add(temp.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return IDs.stream().mapToInt(i -> i).toArray();
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public String getDescription() {
		return Description;
	}
	public double getCalories() {
		return Calories;
	}
	public double getProtein() {
		return Protein;
	}
	public double getCarbs() {
		return Carbs;
	}
	public double getSugars() {
		return Sugars;
	}
	public double getFiber() {
		return Fiber;
	}
	public double getFat() {
		return Fat;
	}
	public double getFatty_acids_sat() {
		return Fatty_acids_sat;
	}
	public double getFatty_acids_mon() {
		return Fatty_acids_mon;
	}
	public double getFatty_acids_pol() {
		return Fatty_acids_pol;
	}
	public double getCholesterol() {
		return Cholesterol;
	}
	public double getRetinol() {
		return Retinol;
	}
	public double getVitamin_A() {
		return Vitamin_A;
	}
	public double getCarotene_al() {
		return Carotene_al;
	}
	public double getCryptoxanthin() {
		return Cryptoxanthin;
	}
	public double getCarotene_be() {
		return Carotene_be;
	}
	public double getLycopene() {
		return Lycopene;
	}
	public double getLutein_with_zeaxanthin() {
		return Lutein_with_zeaxanthin;
	}
	public double getThiamin() {
		return Thiamin;
	}
	public double getRiboflavin() {
		return Riboflavin;
	}
	public double getNiacin() {
		return Niacin;
	}
	public double getVitamin_B6() {
		return Vitamin_B6;
	}
	public double getFolic_acid() {
		return Folic_acid;
	}
	public double getFolate_food() {
		return Folate_food;
	}
	public double getFolate_DFE() {
		return Folate_DFE;
	}
	public double getFolate_total() {
		return Folate_total;
	}
	public double getCholine() {
		return Choline;
	}
	public double getVitamin_B12() {
		return Vitamin_B12;
	}
	public double getVitamin_B12_added() {
		return Vitamin_B12_added;
	}
	public double getVitamin_C() {
		return Vitamin_C;
	}
	public double getVitamin_D() {
		return Vitamin_D;
	}
	public double getVitamin_E() {
		return Vitamin_E;
	}
	public double getVitamin_E_added() {
		return Vitamin_E_added;
	}
	public double getVitamin_K() {
		return Vitamin_K;
	}
	public double getCalcium() {
		return Calcium;
	}
	public double getPhosphorus() {
		return Phosphorus;
	}
	public double getMagnesium() {
		return Magnesium;
	}
	public double getIron() {
		return Iron;
	}
	public double getZinc() {
		return Zinc;
	}
	public double getCopper() {
		return Copper;
	}
	public double getSelenium() {
		return Selenium;
	}
	public double getPotassium() {
		return Potassium;
	}
	public double getSodium() {
		return Sodium;
	}
	public double getCaffeine() {
		return Caffeine;
	}
	public double getTheobromine() {
		return Theobromine;
	}
	public double getAlcohol() {
		return Alcohol;
	}
	public double getWater() {
		return Water;
	}
	public void set_new_ID(int ID, int ID_new) {
		ID = ID_new;
		table.set_value_by_ID(ID, "ID",ID_new);
	}
	public void setName(int ID, String name) {
		Name = name;
		table.set_value_by_ID(ID, "Name",name);
	}
	public void setDescription(int ID, String description) {
		Description = description;
		table.set_value_by_ID(ID, "Description",description);
	}
	public void setCalories(int ID, double calories) {
		Calories = calories;
		table.set_value_by_ID(ID, "Calories",calories);
	}
	public void setProtein(int ID, double protein) {
		Protein = protein;
		table.set_value_by_ID(ID, "Protein" ,protein);
	}
	public void setCarbs(int ID, double carbs) {
		Carbs = carbs;
		table.set_value_by_ID(ID, "Carbs" ,carbs);
	}
	public void setSugars(int ID, double sugars) {
		Sugars = sugars;
		table.set_value_by_ID(ID, "Sugars" ,sugars);
	}
	public void setFiber(int ID, double fiber) {
		Fiber = fiber;
		table.set_value_by_ID(ID, "Fiber" ,fiber);
	}
	public void setFat(int ID, double fat) {
		Fat = fat;
		table.set_value_by_ID(ID, "Fat" ,fat);
	}
	public void setFatty_acids_sat(int ID, double fatty_acids_sat) {
		Fatty_acids_sat = fatty_acids_sat;
		table.set_value_by_ID(ID, "\"Fatty acids, saturated\"" ,fatty_acids_sat);
	}
	public void setFatty_acids_mon(int ID, double fatty_acids_mon) {
		Fatty_acids_mon = fatty_acids_mon;
		table.set_value_by_ID(ID, "\"Fatty acids, monounsaturated\"" ,fatty_acids_mon);
	}
	public void setFatty_acids_pol(int ID, double fatty_acids_pol) {
		Fatty_acids_pol = fatty_acids_pol;
		table.set_value_by_ID(ID, "\"Fatty acids, polyunsaturated\"" ,fatty_acids_pol);
	}
	public void setCholesterol(int ID, double cholesterol) {
		Cholesterol = cholesterol;
		table.set_value_by_ID(ID, "\"Cholesterol (mg)\"" ,cholesterol);
	}
	public void setRetinol(int ID, double retinol) {
		Retinol = retinol;
		table.set_value_by_ID(ID, "\"Retinol (mcg)\"" ,retinol);
	}
	public void setVitamin_A(int ID, double vitamin_A) {
		Vitamin_A = vitamin_A;
		table.set_value_by_ID(ID, "\"Vitamin A, RAE (mcg_RAE)\"" ,vitamin_A);
	}
	public void setCarotene_al(int ID, double carotene_al) {
		Carotene_al = carotene_al;
		table.set_value_by_ID(ID, "\"Carotene, alpha (mcg)\"" ,carotene_al);
	}
	public void setCryptoxanthin(int ID, double cryptoxanthin) {
		Cryptoxanthin = cryptoxanthin;
		table.set_value_by_ID(ID, "\"Cryptoxanthin, beta (mcg)\"" ,cryptoxanthin);
	}
	public void setCarotene_be(int ID, double carotene_be) {
		Carotene_be = carotene_be;
		table.set_value_by_ID(ID, "\"Carotene, beta (mcg)\"" ,carotene_be);
	}
	public void setLycopene(int ID, double lycopene) {
		Lycopene = lycopene;
		table.set_value_by_ID(ID, "\"Lycopene (mcg)\"" ,lycopene);
	}
	public void setLutein_with_zeaxanthin(int ID, double lutein_with_zeaxanthin) {
		Lutein_with_zeaxanthin = lutein_with_zeaxanthin;
		table.set_value_by_ID(ID, "\"Lutein + zeaxanthin (mcg)\"" ,lutein_with_zeaxanthin);
	}
	public void setThiamin(int ID, double thiamin) {
		Thiamin = thiamin;
		table.set_value_by_ID(ID, "\"Thiamin (mg)\"" ,thiamin);
	}
	public void setRiboflavin(int ID, double riboflavin) {
		Riboflavin = riboflavin;
		table.set_value_by_ID(ID, "\"Riboflavin (mg)\"" ,riboflavin);
	}
	public void setNiacin(int ID, double niacin) {
		Niacin = niacin;
		table.set_value_by_ID(ID, "\"Niacin (mg)\"" ,niacin);
	}
	public void setVitamin_B6(int ID, double vitamin_B6) {
		Vitamin_B6 = vitamin_B6;
		table.set_value_by_ID(ID, "\"Vitamin B-6 (mg)\"" ,vitamin_B6);
	}
	public void setFolic_acid(int ID, double folic_acid) {
		Folic_acid = folic_acid;
		table.set_value_by_ID(ID, "\"Folic acid (mcg)\"" ,folic_acid);
	}
	public void setFolate_food(int ID, double folate_food) {
		Folate_food = folate_food;
		table.set_value_by_ID(ID, "\"Folate, food (mcg)\"" ,folate_food);
	}
	public void setFolate_DFE(int ID, double folate_DFE) {
		Folate_DFE = folate_DFE;
		table.set_value_by_ID(ID, "\"Folate, DFE (mcg_DFE)\"" ,folate_DFE);
	}
	public void setFolate_total(int ID, double folate_total) {
		Folate_total = folate_total;
		table.set_value_by_ID(ID, "\"Folate, total (mcg)\"" ,folate_total);
	}
	public void setCholine(int ID, double choline) {
		Choline = choline;
		table.set_value_by_ID(ID, "\"Choline (mg)\"" ,choline);
	}
	public void setVitamin_B12(int ID, double vitamin_B12) {
		Vitamin_B12 = vitamin_B12;
		table.set_value_by_ID(ID, "\"Vitamin B-12 (mcg)\"" ,vitamin_B12);
	}
	public void setVitamin_B12_added(int ID, double vitamin_B12_added) {
		Vitamin_B12_added = vitamin_B12_added;
		table.set_value_by_ID(ID, "\"Vitamin B-12, added (mcg)\"" ,vitamin_B12_added);
	}
	public void setVitamin_C(int ID, double vitamin_C) {
		Vitamin_C = vitamin_C;
		table.set_value_by_ID(ID, "\"Vitamin C (mg)\"" ,vitamin_C);
	}
	public void setVitamin_D(int ID, double vitamin_D) {
		Vitamin_D = vitamin_D;
		table.set_value_by_ID(ID, "\"Vitamin D (D2 + D3) (mcg)\"" ,vitamin_D);
	}
	public void setVitamin_E(int ID, double vitamin_E) {
		Vitamin_E = vitamin_E;
		table.set_value_by_ID(ID, "\"Vitamin E (alpha-tocopherol) (mg)\"" ,vitamin_E);
	}
	public void setVitamin_E_added(int ID, double vitamin_E_added) {
		Vitamin_E_added = vitamin_E_added;
		table.set_value_by_ID(ID, "\"Vitamin E, added (mg)\"" ,vitamin_E_added);
	}
	public void setVitamin_K(int ID, double vitamin_K) {
		Vitamin_K = vitamin_K;
		table.set_value_by_ID(ID, "\"Vitamin K (phylloquinone) (mcg)\"" ,vitamin_K);
	}
	public void setCalcium(int ID, double calcium) {
		Calcium = calcium;
		table.set_value_by_ID(ID, "\"Calcium (mg)\"" ,calcium);
	}
	public void setPhosphorus(int ID, double phosphorus) {
		Phosphorus = phosphorus;
		table.set_value_by_ID(ID, "\"Phosphorus (mg)\"" ,phosphorus);
	}
	public void setMagnesium(int ID, double magnesium) {
		Magnesium = magnesium;
		table.set_value_by_ID(ID, "\"Magnesium (mg)\"" ,magnesium);
	}
	public void setIron(int ID, double iron) {
		Iron = iron;
		table.set_value_by_ID(ID, "\"Iron (mg)\"" ,iron);
	}
	public void setZinc(int ID, double zinc) {
		Zinc = zinc;
		table.set_value_by_ID(ID, "\"Zinc (mg)\"" ,zinc);
	}
	public void setCopper(int ID, double copper) {
		Copper = copper;
		table.set_value_by_ID(ID, "\"Copper (mg)\"" ,copper);
	}
	public void setSelenium(int ID, double selenium) {
		Selenium = selenium;
		table.set_value_by_ID(ID, "\"Selenium (mcg)\"" ,selenium);
	}
	public void setPotassium(int ID, double potassium) {
		Potassium = potassium;
		table.set_value_by_ID(ID, "\"Potassium (mg)\"" ,potassium);
	}
	public void setSodium(int ID, double sodium) {
		Sodium = sodium;
		table.set_value_by_ID(ID, "\"Sodium (mg)\"" ,sodium);
	}
	public void setCaffeine(int ID, double caffeine) {
		Caffeine = caffeine;
		table.set_value_by_ID(ID, "\"Caffeine (mg)\"" ,caffeine);
	}
	public void setTheobromine(int ID, double theobromine) {
		Theobromine = theobromine;
		table.set_value_by_ID(ID, "\"Theobromine (mg)\"" ,theobromine);
	}
	public void setAlcohol(int ID, double alcohol) {
		Alcohol = alcohol;
		table.set_value_by_ID(ID, "\"Alcohol (g)\"" ,alcohol);
	}
	public void setWater(int ID, double water) {
		Water = water;
		table.set_value_by_ID(ID, "\"Water (g)\"" ,water);
	}
}
