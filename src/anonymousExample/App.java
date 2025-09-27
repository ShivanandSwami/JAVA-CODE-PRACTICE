package anonymousExample;

public class App {

	public static void main(String[] args ) {
		
	
//	Vehicle v1= new vehicle() {
//		
//		
//		
//	}
//	}
	
	
	Vehicle v1= (int a)-> System.out.println("Vehicle is running at speed:"+a);
	v1.run(40);
	
	Runnable r1= () -> {
		for (int i=0; i<=10;i++) {
		System.out.println("Thread started....");
		}
	};
	Thread t1= new Thread (r1);
	t1.start();
	}	
}
