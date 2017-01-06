import java.io.*;
public class MealTracker{

    private static String Date;
    private static String MealType;
    private static String Meal;
    private static String Cal;
    private static String Protein;
    private static String Carb;
    private static String Fat;

    public static void main(String[]args) throws IOException{ //either prompt them to add one by one or force them to enter all arguments
	if (args.length == 7){
	    Date = args[0];
	    MealType = args[1];
	    Meal = args[2];
	    Cal = args[3];
	    Protein = args[4];
	    Carb = args[5];
	    Fat = args[6];
	    enter(Date, MealType, Meal, Cal, Protein, Carb, Fat);
	}
	else if (args.length == 1){
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
	    System.out.println("Usage: java MealTracker [date][mealtype][food][calories][protein][carbs][fats]");
	}
    }

    public static void enter(String date, String mealType, String meal, String cal, String protein, String carb, String fat) throws IOException{
	FileWriter fw = new FileWriter("Meals.csv", true);
	if(mealType.equals("Breakfast")){
	    fw.append(date + "\n");
	}
	fw.append(mealType + "," + meal + "," + cal + "," + protein + "," + carb + "," + fat + "\n");
	fw.flush();
	fw.close();
	}

}
