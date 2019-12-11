class MyRunnableThread implements Runnable{
		public void run(){
			for(int i =0 ; i< 10; ++i){
				System.out.println("My thread");
			}
		}
		public static void main(String[] args){
			//MyRunnableThread myRunnableThread = new MyRunnableThread();
			Thread thread = new Thread(new MyRunnableThread());
			
			thread.start();
			
			for(int i =0 ; i< 10; ++i){
			System.out.println("Main thread");
		}
			
		}//main
}//class