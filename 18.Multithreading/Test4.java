//Use sleep method

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
            try
            {
                Thread.sleep(1000);			//---> It sleep for 1000 ms then continue the loop
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Test4{
	public static void main(String args[])throws Exception{
		MyThread obj = new MyThread("Thread");
		obj.start(); 
	}
}