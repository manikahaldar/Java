//Daemon method in thread calss
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

class Test5{
	public static void main(String args[])throws Exception{
		MyThread obj = new MyThread("Thread");
		obj.setDaemon(true);
		obj.start(); 
		// Without sleep method the Daemon does not print anything becasue the main method is end
		try
		{
			Thread.sleep(1000);			//---> It sleep for 1000 ms then continue the loop
		}								
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//Within 1000 ms it has printed 2121 values. After 1000 ms it will stop to running becasue of main method is end  
		
	}
}