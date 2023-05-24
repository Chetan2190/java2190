package Day10Variable;

public class AllinOneVariable {

	//global variable
		static int empId=10;//static global variable
		double salary;//non-static global variable
		public static void main(String[] args) {
			System.out.println("Programs starts");
			//local variables
			int age=25;
			System.out.println("Local variable "+age);//access local variable
			age=50;//updating age value
			System.out.println("update Local variable "+age);//access updated value
			System.out.println("Static Global Variable "+ AllinOneVariable.empId);//access

            AllinOneVariable.empId=20;//updated
            System.out.println("Updated Static Global Variable " +AllinOneVariable.empId );
            
            AllinOneVariable ref=new AllinOneVariable();
            System.out.println("Non static Global "+ref.salary);
            ref.salary=2.2353;
            System.out.println("Updated Non Static +ref.salary");
            System.out.println("Program ends");
			
		

	}

}
