public class ExWeek3
{
	public static void main(String [] nilaiTerima)
	{

		


		//int noInt='10';
		// int [] nataInt = new int[4];

		// for(int i=0;i<nataInt.length;i++)
		// {
		// 	System.out.println(nataInt[i]);
		// }




		// int noInt = 123;
		// int noInt2 =456;
		// double noDouble = 789.012;
		// System.out.format("%6d dan %4d", noInt,noInt2);
		// System.out.format("%4d", noInt,noInt2);
		// System.out.format("$%7.2f",noDouble);
		// System.out.printf("\n$%7.2f dan %6d dan %4d",noDouble,noInt,noInt2);



		// System.out.println("Nilai 1: " + nilaiTerima[0]);
		// System.out.println("Nilai 1: " + nilaiTerima[1]);
		// System.out.println("Nilai 1: " + nilaiTerima[2]);



	// 	int sum =0;

	// 	for(int i=0;i<nilaiTerima.length;i++)
	// 	{
	// 		System.out.println("Nilai 1: " + nilaiTerima[i]);
	// 		sum+= Integer.parseInt(nilaiTerima[i]);
	// 		System.out.println("Nilai sum: " + sum);
	// 	}




	//final static char CHARSAYA = 53;// 1 nilai = 5
	// System.out.println("Char " + CHARSAYA);
	// CHARSAYA =100;
	// System.out.println("Char " + CHARSAYA);



		// int [] tataInt = {10,20,30,40};
		// //ordinary for
		// for(int i = 0; i < tataInt.length; i++)
		// {
		// 	System.out.println(tataInt[i]);
		// }
		// //for-each or advanced for
		// for (int t : tataInt)
		// {
		// 	System.out.println(" For each : " + t);
		// }




		// String nama;
		// int nombor;
		// double noDouble;

		// Scanner input = new Scanner(System.in);

		// System.out.println("Enter a string : ");
		// nama = input.nextLine(); // for input.nextLine();
		// System.out.println("Number is " + nama);

		// System.out.println("Enter a number : ");
		// nombor = input.nextInt();
		// System.out.println("Number is " + nombor);

		// // input.nextLine();

		// System.out.println("Enter a double : ");
		// noDouble = input.nextDouble();
		// System.out.println("Number is " + noDouble);

		// input.close();




		int noInt = 10,x;

		// if (noInt == 10)
		// 	System.out.println("sama");
		// else
		// 	System.out.println("tak sama");
		// System.out.println(noInt == 10 ? "sama" : "tak sama");// true : false

		 if (noInt == 10)
			x =3;
		else
			x =19;
		// ternary operator
		x = noInt == 10 ? 3 : 19;
		System.out.println("x is " + x);

	}
}