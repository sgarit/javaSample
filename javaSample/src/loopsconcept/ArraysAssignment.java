package loopsconcept;

import java.text.DecimalFormat;

public class ArraysAssignment {

	public static void main(String[] args) {
		int counter = 0;
		for (int a = 0; a <= 39; a++) {
			DecimalFormat formatter = new DecimalFormat("00");
			String aFormatted = formatter.format(a);
			counter++;
			if (counter == 10) {
				counter = 0;
				System.out.println(aFormatted);
			} else {
				System.out.print(aFormatted);
			}
		}
		System.out.println("-----------------");
		String[] cricketerDetails = new String[6];
		cricketerDetails[0] = "Name";
		cricketerDetails[1] = "Age";
		cricketerDetails[2] = "Team Name";
		cricketerDetails[3] = "DOB";
		cricketerDetails[4] = "Gender";
		cricketerDetails[5] = "Strike Rate";
		int size = cricketerDetails.length;
		//System.out.println(size);	
		Object[] objectArray = new Object[6];
		objectArray[0] = "Aditya";
		objectArray[1] = "34";
		objectArray[2] = "India";
		objectArray[3] = "28-06-1985";
		objectArray[4] = "Female";
		objectArray[5] = "2";
		Object[] objectArray1 = new Object[6];
		objectArray1[0] = "Aarush";
		objectArray1[1] = "40";
		objectArray1[2] = "India";
		objectArray1[3] = "05-08-1981";
		objectArray1[4] = "Male";
		objectArray1[5] = "5";
		for (int l = 0; l < size; l++) {
			System.out.print(cricketerDetails[l] + " ");
		}
		System.out.println(" ");
		for (int l = 0; l < size; l++) {
			System.out.print(objectArray[l] + " ");
		}
		System.out.println("");
		for (int l = 0; l < size; l++) {
			System.out.print(objectArray1[l] + " ");
		}
		System.out.println("");
		//System.out.println("-----------------");
		int count = 0;
		while (count <= 10) {
			if (count % 7 != 0) {
				System.out.println(count);
			}
			count++;
		}
		System.out.println("-----------------");
		for (int p = 4; p >= 0; p--) {
			System.out.println("n =" + " " + p);
		}


	}

}
