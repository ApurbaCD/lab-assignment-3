

public class array {
        public static void main(String[] args) {
            int i;
            int ar[]=new int [10];
            for(i=0;i<ar.length;i++){
                ar[i]=(int)(Math.random()*10);
               // System.out.println(+ar[i]);
            
            }
    
        
        for(i=0;i<10;i++){
            if((ar[i]%2)==1){
           System.out.print(ar[i]);
           System.out.print(" " );
            }
        }
        System.out.println("");
        for(i=9;i>=0;i--){
             System.out.print(ar[i]);
             System.out.print(" " );
            
        }
        System.out.println("");
        System.out.print(ar[0]+" ");
        System.out.print(ar[(ar.length-1)]);
        System.out.println("");
        for(i=0;i<ar.length;i=i+2){
            System.out.print(ar[i]+" ");
        }
        
    
    
    
    
    }  
    }
    
        
    
    
