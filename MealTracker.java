import java.io.*;
public class MealTracker{
    private String date;
    private String meal;
    private String food;
    private int cal;
    private int protein;
    private int carb;
    private int fat;
    public static void main(String[]args) throws IOException{ //either prompt them to add one by one or force them to enter all arguments
	if (args.length == 2){
	    System.out.println("2");
	}
	else if (args.length == 3){
	    System.out.println("3");
	}
	else{
	    System.out.println("Usage: java MealTracker [date]");
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
