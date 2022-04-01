//Thread class methods

class MyThread extends Thread{
	MyThread(String name){
		super(name);
	}
}

class Test3{
	public static void main(String args[]){
		MyThread obj = new MyThread("Thread");
		
		//Get Method
		System.out.println("ID: "+obj.getId());
		System.out.println("NAME: "+obj.getName());
		System.out.println("PRIORITY: "+obj.getPriority());
		System.out.println("STATE: "+obj.getState());
		obj.start();
		System.out.println("STATE: "+obj.getState());
		
		//Enquiry method
		System.out.println("ALIVE: "+obj.isAlive());
		System.out.println("DAEMON: "+obj.isDaemon());
		System.out.println("INTERUPTED: "+obj.isInterrupted());
	}
}