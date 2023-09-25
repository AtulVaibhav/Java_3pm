
class Writing{
	public static final String pen = "PEN";
	public static final String paper = "PAPER";
}


class User1Thread extends Thread{
	@Override
	public void run(){
		synchronized(Writing.pen){
			System.out.println("User1 acquired pen");
			System.out.println("User1 is waiting for paper");
			synchronized (Writing.paper) {
				System.out.println("User1 acquired paper");
				System.out.println("Writing process completed");
			}
		}
	}
}

class User2Thread extends Thread{
	@Override
	public void run(){
		synchronized (Writing.paper) {
			System.out.println("User2 acquired paper");
			System.out.println("User2 is waiting for pen");
			synchronized (Writing.pen) {
				System.out.println("User2 acquired pen");
				System.out.println("Writing process completed");
			}
		}
		
	}
}

public class Deadlock {

	public static void main(String[] args) {
		User1Thread thread = new User1Thread();
		User2Thread thread2 = new User2Thread();
		thread.start();
		thread2.start();
		

	}

}
