import java.util.*;

class ArrayListTest{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(5);
		list.add(60);
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(70);
		list.add(25);
		
		System.out.println("============Data in List============");
		System.out.println(list);
		
		Iterator iterator = list.iterator();
		System.out.println("============Data with iterator List============");
		while(iterator.hasNext()){
			int val = (int)iterator.next();
			System.out.print(val-1+" ");
		}
		System.out.println();
		System.out.println("============Data in List after shorting============");
		list.sort(new MyComprator());
		System.out.println(list);
	}//main
}//class
class MyComprator implements Comparator{
	public int compare(Object obj1, Object obj2){
		int val1 = (int)obj1;
		int val2 = (int)obj2;
		if(val1>val2){
			return +1;
		}
		else if(val1<val2){
			return -1;
		}
		else{
			return 0;
		}
	}
}