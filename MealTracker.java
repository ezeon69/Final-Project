import java.io.*;
<<<<<<< HEAD
import java.util.Scanner;
=======
import java.util.*;

>>>>>>> master
public class MealTracker{

    private static String Date;
    private static String MealType;
    private static String Meal;
    private static String Cal;
    private static String Protein;
    private static String Carb;
    private static String Fat;
<<<<<<< HEAD
    private static String[]total;

=======
    
>>>>>>> master
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
<<<<<<< HEAD
=======
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
>>>>>>> master
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
