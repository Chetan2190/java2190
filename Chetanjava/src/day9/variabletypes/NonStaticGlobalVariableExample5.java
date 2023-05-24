package day9.variabletypes;

public class NonStaticGlobalVariableExample5 {
    int num1=50;
    int num2=25;
    public static void main(String[] args) {
    System.out.println("Program starts");
    NonStaticGlobalVariableExample5 ref;
    ref = new NonStaticGlobalVariableExample5();
    System.out.println("value of num1 = " +ref.num1);
    System.out.println("value of num2 = " + ref.num2);
    System.out.println("Program Ends");
    
   


	}

}
