package edu.bonn.jbc.collections.pizza;
import java.util.*;

public class Queue <T>{
  private LinkedList<T> list = new LinkedList<T>();
  public void put(T v) { list.addFirst(v); }
  public T get() { 
    return list.removeLast(); 
  }
  public boolean isEmpty() { 
    return list.isEmpty(); 
  }
@Override
public String toString() {
	return "Queue [list=" + list + "]";
}
  
 public int size(){
	 return list.size();
 }
}