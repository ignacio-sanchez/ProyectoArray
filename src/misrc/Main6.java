

package misrc;

public class Main6 {
    
    public static void main(String[] args) {

        char [] palabra = {'a', 'b', 'e', 'j', 'a'};
        char[] copia = new char[9];
        System.out.println(palabra);
        
        System.arraycopy(palabra, 0, copia, 4, palabra.length);
        System.out.println(copia);
        
        for (int i = 0; i<copia.length; i++) {
            System.out.println(copia[i]);
        }
                
    }
    
}
