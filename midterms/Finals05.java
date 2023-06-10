class Finals05 
{ 
    static int foo(int x[]) { 
        for(int i = 0; i < x.length; i = i + 2) 
        { 
            if (x[i] < x[i+1]) { 
                int tmp; 
                tmp = x[i]; 
                x[i] = x[i+1];
                x[i+1] = tmp;
             } 
            
            
            } 
            int val = 2*x.length;  //there is no for loop, it creates only once! 
            
            for(int i = 1; i < x.length; i = i + 2) 
            { 
                if (val > x[i]) val = x[i]; 
            } 
            return val; //returns min
        } 
        
        public static void main(String args[])
         { 
            int data[] = { 2,7,6,3,1 }; 
            int x[] = new int[2*data.length]; 
            
            for(int i = 0; i < x.length; i++) 
            { 
                if (i < data.length)
                 x[i] = data[i]; 
                
                else x[i] = data[i-data.length] + 10; 
            } 

          
            System.out.println("answer = " + foo(x));
         }
}
