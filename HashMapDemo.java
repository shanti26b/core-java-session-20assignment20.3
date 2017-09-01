// here i am showing the key-pair of values

package Assignment20;   // here i am creating package name as Assignment20

import java.util.HashMap;

public class HashMapDemo {   // here i am creating Class name as HashMapDemo
	
	public static void main (String []args){  // and main method

	//Creating HashMap object taking arguments of integer and string types
		
	HashMap<Integer,String>hdtvObjects= new HashMap<Integer,String>();
	
	
	//Here we are Adding  key-value pairs to the HMap object
	
	hdtvObjects.put(24,"LG");
	hdtvObjects.put(123,"Sony");
	hdtvObjects.put(6," samsung");
	hdtvObjects.put(3,"Reliance");
	hdtvObjects.put(4,"Lenovo");
	hdtvObjects.put(7, "microsoft");
	
	//  Here we are  Adding a key-value pair to the HashMap that  
	
	hdtvObjects.put(3, "panasonic");
	
	
	
	// here we are  Retrieving a value associated with a given key from the HashMap object 
   
	Integer key = 3; 
	String value = hdtvObjects.get(key);
	
	System.out.println("Key: " + key); 
	
    System.out.println("Value is : "+value);
    

     // Here it Clears all the key-value pair elements present in the HashMap.
    
	// hdtvObjects.clear();
	 
	 
	//to sort the key-value pairs we are using the HashMap object 
	 
	HashMap<Integer, String>sortedMap = new HashMap<Integer,String>(hdtvObjects);
	
	
	//displays in the form of sorted order 
	
	System.out.println("After sorting the list: "+sortedMap);

	
	}

}


