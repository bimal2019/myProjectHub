
public class CreateDeadLock implements Runnable{
private String lock1;
private String lock2;



public CreateDeadLock(String lock1, String lock2) {
	// TODO Auto-generated constructor stub
	super();
	this.lock1 =lock1;
	this.lock2 = lock2;
}

@Override
public void run() {
	// TODO Auto-generated method stub
	synchronized(lock1) {
		System.out.println("LOCK1"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(lock2) {
		System.out.println("LOCK2"+Thread.currentThread().getName());
		}
	}
	
}

}
