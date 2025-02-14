import java.sql.SQLOutput;

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

		{
			int n = 1;
			System.out.println("n++ = " + n++);
		}
		{
			int n = 1;
			System.out.println("++n = " + ++n);
		}

		{
			System.out.println("10 % 3 = " + 10 % 3); // 1
			System.out.println("10 % -3 = " + 10 % -3); // 1
			System.out.println("-10 % 3 = " + -10 % 3); // -1 ?
		}

		//can every while loop be expressed as a for loop?
		{
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			int i = 0;
			while(i < 10){
				System.out.println(i);
				i++;
			}
		}
		//can every do-while loop be expressed as a while loop?
		{
			int i = 0;
			do{
				i += 2;
				System.out.println(i);
			} while(i < 10);
		}
		{
			int i = 0;
			while (i < 10) {
				i += 2;
				System.out.println(i);
			}
		}
		{
			double gpa = 4.0;
			if (gpa >= 1.5) {
				if (gpa < 2.0)
					System.out.println("Probation");
			}
			else System.out.println("failing");

			{
				for (int i = 1; i < 100; ++i){
					System.out.println(i);
				}
			}

		}
	
	}

}
