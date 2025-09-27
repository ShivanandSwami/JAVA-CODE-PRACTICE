package constructors;

public class ParameterizedConstructor {
	int age ;
	int rollnumber; 
	ParameterizedConstructor(int a, int b){
		
		age=a;
		rollnumber =b;
	}
		public static void main(String[] args) {
			ParameterizedConstructor obj_P= new ParameterizedConstructor(40,1999);
			
			System.out.println("The age is: " +obj_P.age);
			System.out.println("The roll number is: " +obj_P.rollnumber);
	}

}
