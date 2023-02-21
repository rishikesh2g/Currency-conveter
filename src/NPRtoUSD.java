package Currency_Convertor;

// using the concept of inheritance --> inherit the properties of parent(Abstract) class using extends keyword
public class NPRtoUSD extends Abstract{
    double NPR;   // default access modifier --> we can access default access modifier only on this package

    //    creating the constructor
    public NPRtoUSD(double NPR) {
        this.NPR = NPR;
    }
    @Override  // overriding the parent class method
    double NPRtoINR() {
        System.out.print("Total amount in INR is "); //converting Nepalis to indian currency
        return NPR*0.63; // return means method is over, and it will come out to the stack memory
    }

    @Override
    double NPRtoUSD() {
        System.out.print("Total amount in USD is ");
        return NPR*0.0076;
    }
}
