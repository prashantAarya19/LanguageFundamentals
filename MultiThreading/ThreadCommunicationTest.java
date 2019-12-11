class ThreadCommunicationTest implements Runnable{
		//static Thread mainThread;
		
		public void run(){
			/*try{
			mainThread.join();
			}
			catch(Exception e){
				e.printStackTrace();
			} */
			for(int i =0 ; i< 10; ++i){
				System.out.println("My thread");
			}
		}
		public static void main(String[] args)throws Exception{
			//ThreadCommunicationTest.mainThread = Thread.currentThread();
			
			Thread threadCommun = new Thread(new ThreadCommunicationTest());
			Thread.yield();
			threadCommun.start();
			//threadCommun.join();
			for(int i =0 ; i< 10; ++i){
				System.out.println("Main thread");
			}
			
		}//main
}//class