package Currency_Convertor;              /*Creating our own exceptions using Exception class so that we
                                          can easily handle all the exceptions throughout the project*/

public final class MyException extends Exception{
                                            //using the concept of inheritance so that we can easily access the functions and variables of Exception class

                                        //creating a constructor
    public MyException(String message) {
        super(message);
                                    //super keyword is used for calling parent(Exception) class constructor
    }
    public MyException() {super("please enter only valid integers");
                                //super keyword is used for calling parent(Exception) class constructor
    }


}
