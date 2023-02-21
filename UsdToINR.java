package Currency_Convertor;

public class UsdToINR{
    // encapsulation -> here we put all the methods and variables in a class so that we can prevent it from the outside world

    protected double USD;   // data hiding/access modifier we can access this variable only on this package and
                            // subclass of different package
    // creating constructor
    public UsdToINR(double USD) {
        this.USD = USD;
    }
    public UsdToINR() {

    }

    // creating method of void type which means method is not returning anything
    public void Print(){
        // public access modifier --> means we can access this function anywhere.
        System.out.println("Please enter amount in USD(US dollar)");
    }

    public double usdToInr(){
        double ans = USD*82.52;
        System.out.print("Total amount in INR is ");
        return ans;
    }

}
