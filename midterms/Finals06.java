import java.util.*;

class StrangeStack<E> extends Stack<E>{ 
    StrangeStack() { 
        super(); 
    } 
    
public E push(E e) { 
    return super.push(e); 
} 
public String toString() { 
    String s = "<"; 
    int n = size();
     for(int i = 0; i < n-1; i++) { 
        s = s + elementAt(i) + ","; 
    } s = s + elementAt(n-1) + ">"; 
    return s; 
 }
}
class Finals06 {   
    public static void main(String args[])   
    {       
        int data[] = { 2, 7, 6, 3, 1 };    
        StrangeStack<Object> x = new StrangeStack<Object>();    
        x.push(data[0]);    
        x.push("Kim");    
        
        StrangeStack<Object> y = new StrangeStack<Object>();    
        y.push(data[1]);    
        y.push("Tae");    
        x.push(y);    
        x.push(data[2]);    
        x.push("Gyun");    
        y.pop();    
        x.pop();    
        
        StrangeStack<Object> z = new StrangeStack<Object>();    
        y.push(z);    
        z.push(data[3]);    
        z.push(data[4]);    
        x.pop();    
        System.out.println(x); 
      }
}
