
class Resource{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i)+" "+Thread.currentThread().getName());
		}
	}
}
class A extends Thread{
	Resource resource;
	A(Resource resource){
		this.resource = resource;
	}
	public void run(){
		resource.printTable(2);
	}
}

class B extends Thread{
	Resource resource;
	B(Resource resource){
		this.resource = resource;
	}
	public void run(){
		resource.printTable(3);
	}
}

public class AssignTask {

	public static void main(String[] args) {
		Resource obj = new Resource();
		A a = new A(obj);
		B b = new B(obj);
		
	   a.setName("Thread A");
	   b.setName("Thread B");
	   
	   a.start();
	   b.start();

	}

}
