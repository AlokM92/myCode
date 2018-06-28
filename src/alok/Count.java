package alok;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Count {

	static int arr[]={1,2,3,3,5,6,6,7,7,8,9,9,9,10};
	public static void main(String args[]){
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	int counter=0;
for(int i=0;i<arr.length;i++){
	if(map.containsKey(arr[i])){
		map.put(arr[i],map.get(arr[i])+1);
	}
	else
		map.put(arr[i],1);
}
System.out.println(map);
Iterator<Integer> chariter=map.keySet().iterator();
while(chariter.hasNext()){
	int ch=chariter.next();
	System.out.println("No. of pairs"+ch);
}

}
}