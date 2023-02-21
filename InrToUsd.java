package Currency_Convertor;

// using inheritance
public class InrToUsd extends UsdToINR{
//  here we use access modifier private to hide the data so that no one can access this variable outside
//    this file but still we can access private data by the help of getters and setters in java
    private double INR;

//    creating a constructor


    public InrToUsd(double INR) {      // constructor overloading --> two or more constructor having same
        this.INR = INR;                // body and name but different parameters or type of parameters

    }

    // creating default constructor
    public InrToUsd() {
        this(0);   // constructor is calling another constructor with the help of this keyword
    }

    public double inrToUsd(){
        double ans = INR/82.52;
        System.out.print("Total amount in USD is ");
        return ans;   // return means method is over, and it will come out to the stack memory

    }
    @Override  // annotation
    public void Print(){
        System.out.println("Please enter amount in INR(indian rupee)");
    }


    // concept of inner classes --> class inside a class
    public class InnerClass{
        // creating our first method in innerclass
        public static void ThankYou(){
            System.out.println("Thanks for using our Software :)");
        }
    }
}
