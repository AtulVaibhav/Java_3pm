
public class ThreadCreation extends Thread{
	
	//task defined here
	@Override
	public void run(){
		//task which will be executed by threads
		
		//System.out.println(Thread.currentThread().getName()+" inside run()");
		
		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

	public static void main(String[] args) {
		//main thread : parent
		ThreadCreation t1 = new ThreadCreation();//child thread
		ThreadCreation t2 = new ThreadCreation();//2nd child thread
		ThreadCreation t3 = new ThreadCreation();
	    
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		t3.setName("Thread-C");
		
		//Thread Scheduler
		t1.start();//Causes this thread to begin execution
		t2.start();
		t3.start();
		
		
		
	}

}
