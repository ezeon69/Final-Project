import java.io.*;
public class MealTracker{

    private String Date;
    private String MealType;
    private String Meal;
    private int Cal;
    private int Protein;
    private int Carb;
    private int Fat;

    public static void main(String[]args) throws IOException{ //either prompt them to add one by one or force them to enter all arguments
	if (args.length == 7){
	    Date = args[0];
	    MealType = args[1];
	    Meal = args[2];
	    Cal = args[3];
	    Protein = args[4];
	    Carb = args[5];
	    Fat = args[6];
	    
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
	enter("Breakfast", "Cereal");
	enter("Lunch", "Sandwich");
    }

    public static void enter(String mealType, String meal) throws IOException{
	FileWriter fw = new FileWriter("Meals.csv", true);
	if(mealType.equals("Breakfast")){
	    fw.append("date" + "\n");
	}
	//String info = nutritionalInfo(mealType);
	fw.append(mealType + "," + meal + "," + "info");
	fw.flush();
	fw.close();
	}

}
