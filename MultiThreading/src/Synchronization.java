

class SharedResource{
	public synchronized void printData(){
		System.out.println(Thread.currentThread().getName()+" acquired the lock");
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		System.out.println(Thread.currentThread().getName()+" releasing the lock ");
	}
}
public class Synchronization {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				resource.printData();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				resource.printData();
				
			}
			
		});
		t1.start();
		t2.start();
	}

}
