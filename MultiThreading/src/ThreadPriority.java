/**
 * 
 * MAX_Priority :10
 * Min_Priority  : 1
 * Normal_Priority: 5
 * 
 * 
 *
 */

class ResourceData{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i)+" "+Thread.currentThread().getName());
		}
	}
}
class ThreadA extends Thread{
	ResourceData resource;
	ThreadA(ResourceData resource){
		this.resource = resource;
	}
	public void run(){
		resource.printTable(2);
	}
}

class ThreadB extends Thread{
	ResourceData resource;
	ThreadB(ResourceData resource){
		this.resource = resource;
	}
	public void run(){
		resource.printTable(3);
	}
}



public class ThreadPriority {

	public static void main(String[] args) {
		//main
		//System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        
		ResourceData resource = new ResourceData();
		ThreadA tA = new ThreadA(resource);//Thread 0
		ThreadB tB = new ThreadB(resource);//Thread 1
		
		//System.out.println("priority of tA "+tA.getPriority());
		//System.out.println("priority of tB "+tB.getPriority());
		
		tB.setPriority(Thread.MAX_PRIORITY);
		
		
		tA.start();
		tB.start();
		
	}

}
