
package misrc;
public class Main7 {
    public static void main(String[] args) {
        System.out.println("¿Tamaño del array?");
        int x = Entrada.readInt();
        int[] vector = new int [x];
    
        for(int i = 0; i < vector.length; i++){
            System.out.println("Introduce un valor: ");
            vector[i]= Entrada.readInt();
        }
        
        System.out.println("Su vector de valores es: ");
        for(int i= 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }
}
