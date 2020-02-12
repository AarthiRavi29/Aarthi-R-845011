/* 4. Create a class which accepts a HashMap and returns the keys in the Map 

Class Name 		: MapManager   
Method Name 		: getKeys 
Method Description 	: Returns the keys in the hasp map 
Argument 		: HashMap 
Return Type		: Set 
Logic 			: Retrieve the keys in hash map and return the set of keys  */

package sample;

import java.util.*;

public class Mapmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashMap<Integer,String> map= new HashMap<Integer,String>();
for(int i=0;i<n;i++){
	map.put(sc.nextInt(), sc.next());}
	getkeys(map);
}

	private static void getkeys(HashMap<Integer, String> map) {
		// TODO Auto-generated method stub
		HashSet<Integer> s=new HashSet<Integer>(map.keySet());
		s.forEach(key->System.out.print(key +" "));
		//for (Integer i : map.keySet()) {
			//  System.out.println("key: " + i );
		//	}
	
	}
}