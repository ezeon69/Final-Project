public class MealTracker{
    
    public static void main(String[]args){ //either prompt them to add one by one or force them to enter all arguments
	String date;
	String meal;
	String food;
	int cal;
	int protein;
	int carb;
	int fat;
	if (args.length == 2){
	    System.out.println("2");
	}
	else if (args.length == 3){
	    System.out.println("3");
	}
	else{
	    System.out.println("Usage: java MealTracker [date]");
	}
    }

    



}
