
public class Join extends Thread{
	@Override
	public void run(){
		for(int i=65;i<=70;i++){
			System.out.println(Thread.currentThread().getName()+" "+(char)i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread().getName()+" starts");//main
		Join t1 = new Join();//Thread 0
		Join t2 = new Join();//Thread 1
		Join t3 = new Join();//Thread 2
		Join t4 = new Join();//Thread 3
		t1.start();
		t1.join();

		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		
		//System.out.println(Thread.currentThread().getName()+" complete its task");
	}

}
