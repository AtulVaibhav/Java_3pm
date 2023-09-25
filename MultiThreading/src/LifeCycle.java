/**
 * 1.New
 * 2.Runnable
 * 3.Running
 * 4.Blocked : sleep,wait
 * 5.Dead
 *
 *
 */


public class LifeCycle extends Thread{
	@Override
	public void run(){ //running
		for(int i=1;i<=3;i++){
		System.out.println(i);
		try {
			Thread.sleep(2000);//blocked 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	//dead

	public static void main(String[] args) {
		LifeCycle t = new LifeCycle();//New
		t.start();//runnable

	}

}
