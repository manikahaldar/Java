//Inter- comunication
class MyData{
	int value;
	
	synchronized public void set(int v){
		value = v;
		
	}
	
	synchronized public int get(){
		int x=0;
		x=value;
		return x;
	}
}
class Producer extends Thread{
	MyData data;
	
	public Producer(MyData d){
		data = d;
	}
	public void run(){
		int count = 1;
		while(true){
			data.set(count);
			System.out.println("Producer: "+count);
			count++;
		}
	}	
}

class Consumer extends Thread{
	MyData data;
	
	public Consumer(MyData d){
		data = d;
	}
	public void run(){
		int value;
		
		while(true){
			value=data.get();
			System.out.println("Consumer: "+value);
			
		}
	}	
}
public class Test11{
	public static void main(String args[]){
		MyData obj = new MyData();
		
		Producer obj1 = new Producer(obj);
		Consumer obj2 = new Consumer(obj);
		
		obj1.start();
		obj2.start();
		
	}
}