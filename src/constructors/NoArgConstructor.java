package constructors;

public class NoArgConstructor {
int age;
int rollNumber ;

  		NoArgConstructor(){
  			age=20;
  			rollNumber=4646;
  			
  		}
	
  		public static void main(String[] args ) {
  			
  			NoArgConstructor obj_S= new NoArgConstructor();
  			System.out.println("The age is: " + obj_S.age) ;
  			System.out.println("The Roll number is: " + obj_S.rollNumber) ;
  		}
}
