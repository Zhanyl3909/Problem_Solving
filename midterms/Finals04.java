class Finals04 
{ 
    static int foo(int x[],int pos) 
    { if (pos == 0) 
        { return x[pos]%2; }
         return x[pos]%2 + foo(x,pos-1); 
        } 
    
    public static void main(String args[])
     { int data[] = { 2,7,6,3,1 };
     
      System.out.println("answer = " + foo(data,4)); 
    }
}
