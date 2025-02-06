public class EarlyEval {

	public static void main(String[] args) {

	//1 - I expect a box to be printed 
	System.out.println("+---+\n|   |\n+---+");
	{
	Integer a = new Integer(2);
	Integer b = new Integer(2);
	System.out.println(a == b);
	}
	{
	System.out.println("tomato" == "tomato");
	String a = "tomato";
	String b = "tomato";
	System.out.println(a == b);
	System.out.println("tomato" == ("t" + b.substring(1)));
	}
	
	}
}
