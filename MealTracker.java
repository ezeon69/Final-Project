public class MealTracker{
    public static void enter(String mealType, String meal){
	FileWriter fw = new FileWriter("Meals.csv", true);
	if(mealType.equals("Breakfast")){
	    fw.append(date);
	}
	//String info = nutritionalInfo(mealType);
	fw.append(mealType, meal, "info");
	fw.close();
	}
    public static void main(String[]args){
	enter("Breakfast", "Cereal");
    }
}
