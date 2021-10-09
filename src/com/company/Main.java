package com.company;

import java.io.StringWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //byte x = 2;
        //byte y = (byte) (x + 2);

        //int a = 5;
        //int b = 10;
        //double c = a + b;

        //double a = 10.3;
        //double b = 9.8;

        //int c = (int)a + (int)b;
        //int d = (int)(a + b);

        //String myString = "This is my string";
        //myString.length();

        //String myString = "This is my string";
        //myString.isBlank();

        //String myString = "This is my string";
        //myString.charAt(0);

        //String myString = "This is my string";
        //String my$String = "This Is my string";
        //boolean areEqual = my$String.equalsIgnoreCase(myString);

        //String myString = "This is my string";
        //boolean startsWithThis = myString.startsWith("This");
        //boolean startsWithMyOffset8 = myString.startsWith("is", 5);

        //String myString = "This is my string";
        //boolean contains = myString.contains("is");

        //String myString = "This is my string, there are many like it but this one is mine";
        //String newString =  myString.concat(". The end");

        //String myString = "This is my string, there are many like it but this one is mine";
        //String newString =  myString.replace('i', 'a');
        //String newerString =  myString.replace("re","");

        //String myString = "This is my string, there are many like it but this one is mine";
        //String newString =  myString.toLowerCase();

        //String homeStreet = "Romanov Str.";
        //int houseNr = 44;
        //int flatNr = 42;


        //String myAddress = String.format("I live at %s and my house is %d, and flat is %d",homeStreet, houseNr, flatNr);
        //       System.out.println(myAddress);

        //StringBuffer buffer = new StringBuffer("My name is");
        //buffer.append(" Yury");

        //System.out.println(buffer);


        //Scanner scanner = new Scanner(System.in);
        //String str = scanner.nextLine();
        //System.out.println(str);

        String myName = "Yury";
        String myLastName = "Chistyakov";
        String myJob = "QA Engineer";
        int myAge = 36;
        String aboutMe = String.format("Hey! My Name is %s and my Lastname is %s, I work as a %s. I'm %d years old.",myName, myLastName, myJob, myAge);
        System.out.println(aboutMe);


        String myString = "Different types of veriables";
        System.out.println(myString);
        String newerString = myString.concat(" are good to have");
        System.out.println(newerString);
        String myNewString = "Veriables are so different";
        System.out.println(myNewString);
        byte a = 77;
        System.out.println(a);
        short h = -3333;
        System.out.println(h);
        int b = 777777;
        System.out.println(b);
        long l = -222222222;
        System.out.println(l);
        float f = 0.0f;
        System.out.println(f);
        double d = 77.7;
        System.out.println(d);
        char t = 's';
        System.out.println(t);
        boolean contains = myString.contains("types");
        System.out.println(contains);
        boolean areEqual = myString.equals(myNewString);
        System.out.println(areEqual);

        String userPrint = "Please, enter your text here, and press Enter to proceed";
        System.out.println(userPrint);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);










    }

}
