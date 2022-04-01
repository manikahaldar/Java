//Multithreading using Runnable interface

class MyThread implements Runnable{
	public void run(){
		int i=1 ;
		while(true){
			System.out.println(i+" Hello");
			i++;
		}
	}
}
class Test2{
	public static void main(String args[]){
		MyThread obj = new MyThread();
		Thread obj1 = new Thread();
		obj1.start();
		int i=1 ;
		while(true){
			System.out.println(i+" World"); 
			i++;
		}
	}
}