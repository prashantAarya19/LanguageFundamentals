import java.util.*;

class MapTest{
	public static void main(String[] args){
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Prashant");
		map.put(102, "Namrata");
		map.put(103, "Narayan");
		map.put(104, "Rima");
		map.put(105, "Mili");
		map.put(106, "Golu");
		map.put(107, "Manish");
		map.put(108, "Abhishek");
		
		System.out.println("=========Data in Map=========");
		System.out.println(map);
		
		System.out.println("=========Using iterator=========");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry val = (Map.Entry)itr.next();
			System.out.print(val.getKey()+" "+ val.getValue()+" |");
		}
			
	}
}//class