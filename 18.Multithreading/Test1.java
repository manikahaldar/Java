//Multi Threading using Thread calss
class MyThread extends Thread{
	public void dispaly(){
		int i=1 ;
		while(true){
			System.out.println(i+" Hello");
			i++;
		}
	}
}
class Test1{
	public static void main(String args[]){
		MyThread obj = new MyThread();
		obj.start();
		int i=1 ;
		while(true){
			System.out.println(i+" World"); 
			i++;
		}
	}
}