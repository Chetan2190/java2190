package Day34StringBuilder;

public class StringBuilderClass {

	public static void main(String[] args) {
		/**
		 * Mutable
		 * not a thread safe ---> multi threading ---> fast
		 * object will be created only by using new keyword
		 */
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("java"); //now original string is changed  
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);}
	StringBuilder sb1=new StringBuilder("Hello Java");
	System.out.println(sb1);
	StringBuilder sb2=new StringBuilder("Hello Java");
	System.out.println(sb2);


}
