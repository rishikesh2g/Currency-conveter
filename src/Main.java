// Project Aim --> implementation of all the concepts that we learn in java Basics course

// Concepts that use in this Project
// 1. classes
// 2.single and multiple Inheritance,
// 3.Abstract classes and methods
// 4.Arrays
// 5.Loops
// 6. Wrapper classes
// 7. if-else condition
// 8. methods in java
// 9.constructors
// 10.Datatype in java
// 11.Packages
// 12.Strings
// 13. creating multiple objects of class
// 14.variables in java
// 15. Generics
// 16. Inner/nested Classes

// create a Currency_Convertor Package --> packages helps us for creating multiple classes of same name in java
// packages are just simply folder structure or folder

package Currency_Convertor;
import java.util.Scanner;
public class Main implements GenericInterface<Object>{   // implements --> class to interface
    // making our class to be generic because generic provides us type safety
    @Override
    public void display(Object value) {
        System.out.println(value);
    }



//    making our Main class to be singleton so that only one object is created
//    if more than one object is created of this class then it means all the reference variables
//    are pointing to the same object

    private Main() {
    }
    private static Main instance;
    public static Main getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    public static void main(String[] args) throws MyException {
        Main main = new Main();  // creating our first object of our Singleton class
        main.display("Welcome to Currency Convertor :)");

        System.out.println("Select from the following");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
       /* System.out.println("3. CAD to INR");
        System.out.println("4. CAD to USD");*/
        System.out.println("3. NPR to INR");
        System.out.println("4. NPR to USD");
        System.out.println("Choose an Option: ");


                                                //using the concept of array--> collection of same data type
        int[]arr;                               // declaration of an array
        arr= new int[10];                       // initialization of an array by the help of  new keyword which means dynamic memory allocation
                                                //using for loop instead of while and do while loop because here we know how many times the loop will run
        for (Integer i = 0; i <10 ; i++) {
                                                //Integer i; using the concept of wrapper classes which provide us some additional functionalities
                                                // iterating the elements of the array
            arr[i] = i+1;  // changing the elements of the array

        }


        Scanner sc = new Scanner(System.in);  // creating object of Scanner class so that we can take the input from the user
        int selectedOption;
        try{
            selectedOption = sc.nextInt();// taking input from the user
        }catch(Exception e){
            throw new MyException("please enter only valid integers");
        }
        try{
                if(selectedOption>6){throw new MyException("Please select from the above options");
              // if user enter wrong value then we throw exception that we handle on MyException.java file
                }

                // if-else ladder only one condition will execute at a time
                if(selectedOption == arr[0]){
                    UsdToINR obj = new UsdToINR(); // creating object of UsdToINR class
                    obj.Print();   // calling print function of UsdToINR class

                    double inr = sc.nextDouble();
                    UsdToINR obj2 = new UsdToINR(inr);  // creating obj of UsdToINR class using constructor which takes one argument
                    System.out.println(obj2.usdToInr());
                } else if (selectedOption ==arr[1]) {
                    UsdToINR obj = new InrToUsd();
                                                            //using the concept of Polymorphism here we create obj of parent class but we call the constructor
                                                            //of child class at run time jvm will decide which function will to run
                        obj.Print();

                    double inr = sc.nextDouble();
                    InrToUsd inrtousd  = new InrToUsd(inr);
                    System.out.println(inrtousd.inrToUsd());
                }
                else if (selectedOption == arr[2]) {
                    System.out.println("please enter amount in NPR");
                    double amount = sc.nextDouble();
                    NPRtoUSD NPRtoUSD = new NPRtoUSD(amount);
                    System.out.println(NPRtoUSD.NPRtoINR());
                } else if (selectedOption == arr[3]) {
                    System.out.println("please enter amount in NPR");
                    double amount = sc.nextDouble();
                    NPRtoUSD NPRtoUSD = new NPRtoUSD(amount);
                    System.out.println(NPRtoUSD.NPRtoUSD());
                }

                InrToUsd ThankYou = new InrToUsd();                     // creating InrToUsd class object so that we can access innerclass and its methods
                System.out.println();
                InrToUsd.InnerClass.ThankYou();                         // calling innerclass/nested class method


            }catch (Exception exception){                               // catching the exception with the help of getMessage() method
                System.out.println(exception.getMessage());
            }
    }
}
