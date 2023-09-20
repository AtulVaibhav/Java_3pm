
public class ThreadCreationUsingRunnable implements  Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}


	public static void main(String[] args) {
		ThreadCreationUsingRunnable t1 = new ThreadCreationUsingRunnable();
        Thread th = new Thread(t1);
        th.setName("Thread-A");
        th.start();
	}

	
}
