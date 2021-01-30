

package misrc;

public class Main4 {
    
    public static void main(String[] args) {
        /*
        int[] vector = {4, 5};
        int[] vectorcopia = {0, 0};
        
        System.arraycopy(vector, vector.length, vectorcopia, 0, vectorcopia.length);
        System.out.println(vectorcopia[0]);
        System.out.println(vectorcopia[1]); */
        
        int a1[] = {4, 5, 23, 45, 6, 1, 3, 5, 6};	   
        int[] a2 = new int[9]; 
        System.arraycopy(a1,0,a2,0,a1.length);
        
        
        System.out.println(a2[0]);
        System.out.println(a2[1]);
        
    }
    
}
