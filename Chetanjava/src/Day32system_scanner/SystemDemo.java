package Day32system_scanner;

public class SystemDemo {

	public static void main(String[] args) {
		String userHome=System.getProperty("user.home");
		System.out.println(userHome);
		
		// checking specific property
		System.out.println("system user dir :"+ System.getProperty("user.home"));
		System.out.println("current working dir :" + System.getProperty("user.dir"));
		
		// clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));//null
		
		// setting specific property
		System.setProperty("user.home", "C:\\Automation session\\Workspace\\Chetanjava\\src\\Day32system_scanner\\SystemDemo.java");
		System.out.println("updated System User Dir: "+System.getProperty("user.home"));
		// setting specific property
		System.setProperty("user.country", "IND");
		// checking property
				System.out.println(System.getProperty("user.country"));//IND
				System.out.println("other than system property: "+System.getProperty("user.password", "none of your business"));

				System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
						+ System.currentTimeMillis());
				System.out.println("current time in " + "nano sec: " + System.nanoTime());
				
				System.out.println(System.getProperty("java.home"));
			}

	}



