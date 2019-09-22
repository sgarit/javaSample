package functions;

public class FunctionsAssignment {

	public static void main(String[] args) {
		// Write a program to print the sum of two numbers entered by user by
		// defining your own method.
		FunctionsAssignment obj = new FunctionsAssignment();
		int a = 10;
		int b = 20;
		int total = obj.sum(10, 20);
		System.out.println(total);
		System.out.println("---------");

		int productRes = obj.product(20, 30);
		System.out.println(productRes);
		System.out.println("---------");
		double[] area = obj.radiusCircumference(7);
		System.out
				.println("area is " + area[0] + "Circumference is " + area[1]);
		System.out.println("---------");
		obj.maxNumber(20, 30, 20);
		obj.minNumber(5, 10, 30);
		System.out.println("---------");
		String evenOdd = obj.evenNum(10);
		System.out.println(evenOdd);
		System.out.println("---------");
		obj.elligibleToVote(10);
		System.out.println("---------");
		obj.isPrime(20);
		System.out.println("---------");
		obj.displayGrades(91);
		System.out.println("---------");
		int factorial = obj.findFactorial(4);
		System.out.println("Factorial is " + factorial);
	}
	 //1.	Write a program to print the sum of two numbers entered by user by 
	 //defining your own method.
	public int sum(int a, int b) {
		int c = a + b;
		return c;

	}

	// 2. Define a method that returns the product of two numbers entered by
	// user.
	public int product(int num1, int num2) {
		int product = num1 * num2;
		return product;

	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method.
	public double[] radiusCircumference(int radius) {
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * 2 * radius;
		// double areaCircum ;
		double[] ans = new double[2];
		ans[0] = area;
		ans[1] = circumference;
		return ans;
	}
	//4. Define two methods to print the maximum and the minimum 
	//number respectively among three numbers entered by user.
	public void maxNumber(int x, int y, int z) {

		if (x > y && x > z)
			System.out.println("First number is largest.");
		else if (y > x && y > z)
			System.out.println("Second number is largest.");
		else if (z > x && z > y)
			System.out.println("Third number is largest.");
		else
			System.out.println("Entered numbers are not distinct");
	}
	public void minNumber(int x, int y, int z) {
		if (x < y && x < z)
			System.out.println("First number is smallest.");
		else if (y < x && y < z)
			System.out.println("Second number is smallest.");
		else if (z < x && z < y)
			System.out.println("Third number is smallest.");
		else
			System.out.println("Entered numbers are not distinct");
	}
	//5. Define a program to find out whether a given number is even or odd.
	public String evenNum(int k) {
		String num = null;
		if (k % 2 == 0) {
			num = "even number";
		} else if (k % 2 != 0) {
			num = "odd number";
		}
		return num;
	}
	//6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a
	//method to find out if he/she is elligible to vote.
	public void elligibleToVote(int age) {
		if (age >= 18) {
			System.out.println("He is elligible to vote");
		} else {
			System.out.println("He is not elligible to vote");
		}

	}
	//7. Define a method to find out if number is prime or not.
	
	public void isPrime(int num) {
		if (num % 2 == 0 && num >= 2) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}
	/*8. Write a program which will ask the user to enter his/her marks
	(out of 100). Define a method that will 
	display grades according to the marks entered as below:*/
	public void displayGrades(int marks) {

		if (marks > 90 && marks <= 100) {
			System.out.println("AA");
		} else if (marks > 80 && marks <= 90)
			System.out.println("AB");
		else if (marks > 70 && marks <= 80) {
			System.out.println("BB");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("BC");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("CD");
		} else if (marks > 40 && marks <= 50) {
			System.out.println("DD");
		} else if (marks <= 40) {
			System.out.println("Fail");
		} else {
			System.out.println("number not found");
		}
	}
	/*9. Write a program to print the factorial of a 
	number by defining a method named 'Factorial'.*/
	public int findFactorial(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
			// System.out.println(fact);
		}
		return fact;

	}
}
