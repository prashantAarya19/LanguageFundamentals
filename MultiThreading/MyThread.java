class MyThread extends Thread{

	public void run(){
		for(int i =0 ; i< 10; ++i){
			System.out.println("My thread");
		}
	}
	public static void main(String[] args){
		MyThread myThread = new MyThread();
		
		myThread.setPriority(3);
		System.out.println("My thread priority::"+myThread.getPriority());
		System.out.println("My thread name::"+myThread.getName());
		
		myThread.start();
		System.out.println("Main thread name::"+Thread.currentThread().getName());
		for(int i =0 ; i< 10; ++i){
			System.out.println("Main thread");
		}
		
	}//main
}//class