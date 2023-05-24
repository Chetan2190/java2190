package Day16Thiskeyword;

public class Thisexample1 {

		int x=25,y=55;
		void calling(int x) {
			System.out.println("local variable x: "+x);
			System.out.println("non static global y:" +y);
			
//			ThisExample1 e1=new ThisExample1();
//			System.out.println("non-static global x: "+e1.x);
					//or
			System.out.println("non static global x:" +this.x);
		}
		public static void main(String[] args) {
			
			Thisexample1 t1= new Thisexample1();
			t1.calling(10);
			System.out.println("x: "+t1.x);
			System.out.println("y: "+t1.y);

		
	}

}
