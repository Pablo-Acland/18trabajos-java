public class Ejercicio_5 {
    public static void main(String[] args) {
        int x=1;
        while (x!=101){
            if ((x%2)==0) {
                System.out.println("Numero par "+x);
                x++;
            }else {
                System.out.println("Numero impar "+x);
                x++;
            }
        }
    }
}
