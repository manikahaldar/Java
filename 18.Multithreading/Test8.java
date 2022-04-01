//Without using Synchronization
class MyData{
	public void display(String str){
		for(int i=0; i<str.length() ; i++){
			System.out.print(str.charAt(i));
		}
	}
}

class MyThread1 extends Thread{
	MyData d; 			//Reference of MyData
	public MyThread1(MyData d){
		this.d = d;
	}
	//Runnabel the thread1
	public void run(){
		d.display("Hello World");
	}
}

class MyThread2 extends Thread{
	MyData d; 			//Reference of MyData
	public MyThread2(MyData d){
		this.d = d;
	}
	//Runnabel the thread2
	public void run(){
		d.display("Welcome");
	}
}

public class Test8{
	public static void main(String args[]){
		MyData obj = new MyData();
		
		MyThread1 obj1 = new MyThread1(obj);
		MyThread2 obj2 = new MyThread2(obj);
		
		obj1.start();
		obj2.start();
	}
	
}