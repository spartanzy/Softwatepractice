package LearnLambda;

public class testRunnner {
	
	
	
	public void run(Runner r) {
		
	}

	public static void main(String[] args) {
		
		
		testRunnner tr = new testRunnner();
		Runner r = new Runner() {

			@Override
			public int run() {
				return 0;
				// TODO Auto-generated method stub
				
			}

			
			
		};
			
		
		
		tr.run(new Runner(){

		public int run() {
				return 0;
				}			
		});
		
		tr.run(() -> {System.out.println("this is test");		
		
		return 1;
		});
		
		

	}

}
