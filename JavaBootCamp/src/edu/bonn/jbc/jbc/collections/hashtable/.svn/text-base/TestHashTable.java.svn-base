package edu.bonn.jbc.collections.hashtable;

/*
A little program to test the HashTable class.  Note that I
start with a really small table so that I can easily test
the resize() method.
*/

public class TestHashTable {

public static void main(String[] args){
   HashTable table = new HashTable(2);
 
   table.put("first","firstValue");
   table.put("second","secondValue");
   table.put("third","thirdValue");
   table.put("fourth","fourthValue");
   table.put("fifth","fifthValue");
         
   System.out.println("   Value is " + table.get("second"));
         
   System.out.println("   containsKey(" + "sixth" + ") is " + table.containsKey("sixth"));
   System.out.println("   containsKey(" + "third" + ") is " + table.containsKey("third"));
    table.dump();   
    table.remove("fifth");
         
    table.dump();
          
}

} // end class TestHashTable

