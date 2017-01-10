import java.io.*;
import java.util.Scanner;
import java.util.*;

public class MealTracker{

    private static String Date;
    private static String MealType;
    private static String Meal;
    private static String Cal;
    private static String Protein;
    private static String Carb;
    private static String Fat;
    private static String[]total;

    public static void main(String[]args) throws IOException{ //either prompt them to add one by one or force them to enter all arguments
	Scanner sc = new Scanner(System.in);
	if(args.length = 0){
	    System.out.print("Hello, welcome to the Meal Tracker. What is the date of today?");
	    Data = sc.next();
	    System.out.println("What is the type of the meal you want to add? (Breakfast, Lunch, or Dinner)");
	    MealType = sc.next();
	    System.out.println("What is the meal you want to add?");
	    Meal = sc.next;
	    System.out.println("How many calories are in your meal?");
	    Cal = args[3];
	    System.out.println("How much protein is in your meal?");
	    Protein = args[4];
	    System.out.println("How many grams of carbohydrates are in your meal?");
	    Carb = args[5];
	    System.out.println("How many grams of fat are in your meal?");
	    Fat = args[6];
	    mealAdd(Date, MealType, Meal, Cal, Protein, Carb, Fat);
            System.out.println("Successfully added meal.");
	}
	else if (args.length == 2){
	    Date = args[0];
	    if(args[1].equals("total")){
		System.out.println(readFile());
	    }
	}
	else if (args.length == 3){
	    Date = args[0];
	    if(args[1].equals("total")){
		if(args[2].equals("calories")){
		    System.out.println(totalCal(Date));
		}
		else if(args[2].equals("protein")){
		    System.out.println(totalPro(Date));
		}
		else if(args[2].equals("carbs")){
		    System.out.println(totalCarb(Date));
		}
		else if(args[2].equals("fats")){
		    System.out.println(totalFat(Date));
		}
	    }
	}
	else{
	    System.out.println("Usage: java MealTracker (optional) [date][total](optional: choose one)[calories][protein][carbs][fats]");
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
	String text = new Scanner(new File("Meals.csv")).useDelimiter("\\A").next(); //file to string
	String lines[] = text.split("\n"); //splits string by csv
    String[][] meals = new String[lines.length][];
    for (int counter = 0; counter < lines.length; counter++) {
        meals[counter] = lines[counter].split(",");
    }
    return meals;
    }

    public String totalCal(String date) throws FileNotFoundException{
	int total = 0;
	int counter = 0;
	while (counter < readFile().length){
	    if ((readFile()[counter][0]) == date){
		total += Integer.parseInt(readFile()[counter][3]);
		counter++;
	    }
	    counter++;
	}
	return Integer.toString(total);
    }

    public String totalPro(String date) throws FileNotFoundException{
	int total = 0;
	int counter = 0;
	while (counter < readFile().length){
	    if ((readFile()[counter][0]) == date){
		total += Integer.parseInt(readFile()[counter][4]);
		counter++;
	    }
	    counter++;
	}
	return Integer.toString(total);
    }

    public String totalCarb(String date) throws FileNotFoundException{
	int total = 0;
	int counter = 0;
	while (counter < readFile().length){
	    if ((readFile()[counter][0]) == date){
		total += Integer.parseInt(readFile()[counter][5]);
		counter++;
	    }
	    counter++;
	}
	return Integer.toString(total);
    }

    public String totalFat(String date) throws FileNotFoundException{
	int total = 0;
	int counter = 0;
	while (counter < readFile().length){
	    if ((readFile()[counter][0]) == date){
		total += Integer.parseInt(readFile()[counter][6]);
		counter++;
	    }
	    counter++;
	}
	return Integer.toString(total);
    }
}
