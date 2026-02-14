public class Main {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>(3);
        
        pila.push("C");
        pila.push("A");
        pila.push("B");
        System.out.println(pila.pop() + " ");
        System.out.println(pila.pop() + " ");
        System.out.println(pila.pop() + " ");

        System.out.println(pila.invierteCadena("Hola Mundo"));
    
    }
    
    
}
