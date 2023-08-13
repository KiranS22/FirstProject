import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


/* In Java regardless of the methods that are created before it, the main method will always run first. Inside the main method is where we call other methords
**/
public class Main {
    public static  int findPositiveSum(int[] arr1){
        int total1 = 0;
        for (int i = 0; i <arr1.length; i++) {
            int value = arr1[i];
            if(value>0){
                total1 += value;
            }



        }
        return  total1;

    }
    public static int countAs(String[] stringArray1) {
        int aCounter = 0;

        for (String word : stringArray1) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' ||word.charAt(i) == 'A' ) {
                    aCounter++;
                }
            }
        }

        return aCounter;
    }




    public static int findMAx(int[] arr2){
        int max = arr2[0];
        for (int i = 0; i <arr2.length; i++) {
            if(arr2[i]> max){
              max = arr2[i];
            }

        }
        return max;
    }

    public static  int  display(int num ){
    return num;
    }
    public static  int  addNums(int num1 , int num2 ){
        return num1 + num2;
    }
    public static  int lengthOfString (String str){
        return  str.length();

    }
    public static  int sumArray (int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
             result += num;


        }
        return result;
    }
    public static int nestedArraySum(int[][] nestedArray) {
        int nestedTotal = 0;
        for (int i = 0; i < nestedArray.length; i++) {
            for (int j = 0; j < nestedArray[i].length; j++) {
                nestedTotal += nestedArray[i][j];
            }
        }
        return nestedTotal;
    }
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

////        While loop
//        int j = 0;
//        while(j<=8){
//            System.out.println("Hello");
//            j++;
//        };
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



//         Sum odd numbers between 100 and 500
        int min = 100;
        int sum = 0;
        for (int p = min; p<500; p++){
            if(p%2 != 0){
                 sum = sum + p;

            }


        }
        String anotherString = "The quick brown fox jumped over the lazy dog";
        int vowelCount = 0;

        for (int m = 0; m < anotherString.length(); m++) {
            char currentChar = anotherString.charAt(m);
            String vowels = "AEIOUaeiou";

            if (vowels.contains(String.valueOf(currentChar))) {
                ++vowelCount;
            }
        }

        System.out.println("Vowel Count " + " "+ vowelCount);


        int num = 10;
        System.out.println("Factors of " + num + " are: ");
        for (int z = 1; z <= num; z++) {
            if (num % z == 0) {
                System.out.println(z + " ");
            }
        }

        //-----------------------------------------------------------------------------------------------------------------------
        int[] numbersArr ={1,2,5,7,9, 10};
//        Array methods
        System.out.println("Length of numbers array:" + numbersArr.length); // finds the length opf the array

        for (int i = 0; i < numbersArr.length; i++) {
            if(numbersArr[i] % 2 == 0){
                System.out.println(" Even Numbers inside loop:"+numbersArr[i]);

            }

        }

for(int item: numbersArr){
            System.out.println("Item inside for each" + item);   //Loops over the whole array accessing index and current item is not possible here
        }
String[] countries = {"UK","Japan","Spain"};
        for (String country: countries) {
            System.out.println("Length of country name: "+ country.length());
        }

//         2D arrays in Java
//        Creating a 2d array

        int[][] my2dArr  = {{1,2,3}, {4,5,6}};
        System.out.println("first index of 2d array: " + my2dArr[0][0]);

        for (int i = 0; i <my2dArr.length ; i++) {
            for (int j = 0; j < my2dArr[i].length; j++) {
                System.out.println("Every value in nested array: " + my2dArr[i][j] + ",i: " + i + ",j: " + j); // inner loop is completed before the outer loop upddates its index value

            }

        }

//         Accepting input from a user (via command line)
     Scanner userInput = new Scanner(System.in); // creating a new instance of the scanner class
//        System.out.println("Please enter a number: ");
//        int userNumber1 = userInput.nextInt();
//        System.out.println("Please  enter another number: ");
//        int userNumber2 = userInput.nextInt();
//        int addMe = userNumber1 + userNumber2;
//        System.out.println(addMe);

//        System.out.println("Enter a word to find the length: ");
//        String userString = userInput.next();
//        System.out.println("The lent of your word is: " + userString.length());

//        calling display method
        int returnedNum = display(12);
        System.out.println("Number returned from display method: " + returnedNum);

        int addResult = addNums(3, 5);
        System.out.println("result from adding nums" + addResult);



         int strLength =lengthOfString("I am a string");
        System.out.println("string length " + strLength);

        int[] someArray = {1, 2, 3, 4};
        System.out.println(sumArray(someArray));

        int[] nums = {1,-3, 40, 50, -100, -2};
        System.out.println("find positive nums sum:  "+ findPositiveSum(nums));
        System.out.println("max in mums: " + findMAx(nums));

         String[] names = {"John", "Robert", "Alice", "Vanessa", "Steven" };
        System.out.println("Number of a's  in mames: " + countAs(names));

        int factoralToFind = 5;
        int factorial = findFact(factoralToFind);
        System.out.println("Factorial of " + number + " is: " + factorial);
        int[][] twoD = {{1,2,3,4}, {4,5,4,5}, {12,3,4,1}, {-10,4,5,3}};

        System.out.println("Some of nested array: " + nestedArraySum(twoD));

    }

    public static int findFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFact(n - 1);
        }
    }

}









