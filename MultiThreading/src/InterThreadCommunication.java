import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Object key = new Object();
		Queue<Integer> queue = new LinkedList<>();
		int size=10;
		
		Thread producer = new Thread(new Runnable(){
			int count = 1;
			@Override
			public void run() {
				synchronized (key) {
				while(true){
					try {
						while(queue.size()==size){
							key.notifyAll();
							key.wait();
							
						}
					
						queue.offer(count++);
						Thread.sleep(1000);
						System.out.println("Producer producing an item "+queue.size());
						
					}catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}}
				
			}
			
		});
		
		
		Thread consumer = new Thread(new Runnable(){

			@Override
			public void run() {
				synchronized (key) {
				while(true){
					try {
						while(queue.size()==0){
							key.notifyAll();
							key.wait();
						}
						queue.poll();
						Thread.sleep(800);
						
						System.out.println("Consumer consumes "+queue.size());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			}
			
		});
		
		producer.start();
		consumer.start();

	}

}
