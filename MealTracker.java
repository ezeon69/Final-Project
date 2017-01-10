import java.io.*;
import java.util.*;

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
	    mealAdd(Date, MealType, Meal, Cal, Protein, Carb, Fat);
            System.out.println("Successfully added meal.");
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
	    System.out.println(Arrays.deepToString(readFile()));
	}
    }

    public static void mealAdd(String date, String mealType, String meal, String cal, String protein, String carb, String fat) throws IOException{
	FileWriter fw = new FileWriter("Meals.csv", true);
	fw.append(date + "," + mealType + "," + meal + "," + cal + "," + protein + "," + carb + "," + fat + "\n");
	fw.flush();
	fw.close();
    }

    public static String[][] readFile() throws FileNotFoundException{
	String text = new Scanner( new File("Meals.csv") ).useDelimiter("\\A").next(); //file to string
    String lines[] = text.split("\n"); //splits string by csv
    String[][] linesCsv = new String[lines.length][];
    for (int i=0; i<lines.length; i++) {
        linesCsv[i] = lines[i].split(",");
    }
    return linesCsv;
    }
    
}
