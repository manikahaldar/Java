//Join method in thread calss

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        
    }
    
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            
        }
    }
}

class Test6{
	public static void main(String args[])throws Exception{
		MyThread obj = new MyThread("Thread");
		obj.setDaemon(true);
		obj.start(); 
		Thread obj2 = Thread.currentThread();
		obj2.join(); 			//After terminating Daemon Thread it will join the new thread, so the loop will continue run (infinite loop)
		
		
		
	}
}