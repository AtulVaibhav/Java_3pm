
public class Intro {
   
	public void doSomething(){
		System.out.println("Hello Java");
	}
	//main --------JVM
	//JVM ---- main thread ----main()
	public static void main(String[] args) {
		//current executing thread
		System.out.println(Thread.currentThread().getName());
		new Intro().doSomething();

	}

}
