// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
//  printing things to the console
//        sout is shortcut for multiline print
        System.out.println("Hello");
        System.out.println("Hello again");

        int myNum = 12;
        int myNum2 = 5;
        int res = myNum + myNum2;
        System.out.println("my addition result" +  " " + res);


//        Data Types
        /*
        *  int, bool string float(6-7 decimals), long, double(15 decimal places)
        * Character has to be in single quotes, strings have to be double quotes
        * */

        int myInt = 44;
        String myString = "Kiran";
        float myFloat = 2.2f;
        double myDouble = 3.1415926535;
        long myLong = 100000000000000000L;
        char myChar = 'p';


// operators
        System.out.println(1+1);
        System.out.println(2*2);
        System.out.println(44-4);
        System.out.println(15 %6);

     System.out.println(myInt++);  // post increment operator will increment value after this  line has ran
        System.out.println(++myInt); // pre increment operator  increments value while line is running
        double  myPowerOp = Math.pow(2, 3); //without type cast this returns a double
        int myPowerOpTypeCast  = (int) Math.pow(2,3); //Type casted to a whole number
        System.out.println(myPowerOp);
        System.out.println(myPowerOpTypeCast);

//        Conditional  operators
        System.out.println(2>1);
        System.out.println(5<=5);
        System.out.println(2==2);
        System.out.println(7!=2);

//        conditional statements
        int number = 0;
        if(number > 6){
            System.out.println("Greater than 6");
        }else{
            System.out.println("less than 6");
        }

//         loops

//          for loop

        for (int i =0; i< 3;i++){
            System.out.println(i);
        };

//        While loop
        int j = 0;
        while(j<=8){
            System.out.println("Hello");
            j++;
        };
//         strings and string methods

        String  someString = "Hello I am coding in Java ";

//        accessing chars in string
        System.out.println("whole string " + " " + someString);
//        System.out.println(someString.charAt(0)); // first char
//        System.out.println(someString.length()); // whole string
        int aCount = 0;
        for (int k = 0; k< someString.length(); k++){
//            System.out.println(someString.charAt(k));
            if(someString.charAt(k) == 'a'){
                aCount++;

            }



        }
        System.out.println(aCount);

        for (int l = 10; l<20; l++){
            if(l %2 == 0 ){
                System.out.println(l);
            }
        }

        System.out.println(someString.indexOf("Java"));
        System.out.println(someString.toUpperCase()); // returns a new string in uppercase
        System.out.println(someString.toLowerCase()); //returns new string in lowercase



//         Arrays
//         Int arrays
        int[] myIntArray = {1,2,3};  // size is predefined with values in curly braces
        System.out.println(myIntArray[0]); //first index

//         defining an empty array

        int[] myEmptyIntArray = new int[12]; //an empty array that has space for 12  locations
        myEmptyIntArray[0] = 4;




    }

}

// Tasks to complete:
//1. Explore the difference between pre-inc & post-inc
//2. Explore all string methods
//3. Write a program that finds the sum of all numbers that are odd, between 100 & 500.
//4. Define a string variable, and count the occurrences of vowels in the string.
//5. Write a program that displays the factors of a number.
//10: 2,5
//15: 3,5
//30: 3,5,10,15