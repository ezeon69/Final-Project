import java.io.*;
import java.util.Scanner;
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
	System.out.print("Hello, welcome to the Meal Tracker. Is this your first meal of the day? (Answer yes/no)");
	String answer = sc.next();
	if(answer.equals("yes")){
	    System.out.println("What is today's date?");
	    Date = sc.next();
	}
	if(answer.equals("no")){
	    System.out.println("Is this your last meal of the day? (Answer yes/no)");
	    String ans = sc.next();
	    if(ans.equals("yes")){
	    }
	    if(ans.equals("no")){
	    }
	}
	System.out.println("What is the name of the meal you want to add?");
	MealType = sc.next();
	    MealType = args[1];
	    Meal = args[2];
	    Cal = args[3];
	    Protein = args[4];
	    Carb = args[5];
	    Fat = args[6];
	    mealAdd(Date, MealType, Meal, Cal, Protein, Carb, Fat);
	}
	else{
	    System.out.println("Usage: java MealTracker [date][mealtype][food][calories][protein][carbs][fats]");
	}
    }

    public static void mealAdd(String date, String mealType, String meal, String cal, String protein, String carb, String fat) throws IOException{
	FileWriter fw = new FileWriter("Meals.csv", true);
	if(mealType.equals("Breakfast")){
	    fw.append(date + "\n");
	}
	fw.append(mealType + "," + meal + "," + cal + "," + protein + "," + carb + "," + fat + "\n");
	fw.flush();
	fw.close();
	}

}
