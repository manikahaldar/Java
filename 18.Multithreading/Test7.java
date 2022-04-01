//Yelid method in Thread class

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
            System.out.println(count++ +" My Thread");
            
        }
    }
}

class Test7{
	public static void main(String args[])throws Exception{
		MyThread obj = new MyThread("Thread");
		
		obj.start(); 
		
		int count=1;
        while(true)
        {
            System.out.println(count++ +" Main");
			//Using yield The My Thread count more time than main
			//Without Using yield The Main count more time than My Thread
			//Yelid will make the main method wait for other thread for gettiong some extra time
			
            Thread.yield();
        }
		
		
	}
}