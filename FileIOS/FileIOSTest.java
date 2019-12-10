import java.io.*;

class FileIOSTest implements Serializable{
	private int id = 0;
	private String name = null;
	private String job = null;
	private transient String password = null;
	
	public FileIOSTest(){
		id = 101;
		name = "john";
		job = "developer";
		password = "dev@123";
	}
	
	public String toString(){
		return "id::"+id+" name::"+name+" job::"+job+" password::"+password;
	}
	public static void main(String[] args)throws Exception{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileIOSTest test = null;
	
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		test = new FileIOSTest();
		
		fos = new FileOutputStream("data.txt");
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(test);
		
		fis = new FileInputStream("data.txt");
		ois = new ObjectInputStream(fis);
		
		System.out.println(ois.readObject());
		
	}//main
}//class