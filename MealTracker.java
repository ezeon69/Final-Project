public class MealTracker{
    String date;
    String meal;
    String food;
    int cal;
    int protein;
    int carb;
    int fat;

    public static void main(String[]args){ //either prompt them to add one by one or force them to enter all arguments
	if (args.length == 1){
	    if (args[0].equals("total")){
		System.out.println("test");
	    }
	}
	else if (args.length == 2){
	    System.out.println("2");
	}
	else if (args.length == 3){
	    System.out.println("3");
	}
	else{
	    System.out.println("Usage: java MealTracker [date]");
	}
    }

    /*public static void enter(String mealType, String meal){
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
	}*/

}
