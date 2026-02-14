public class Pila <T> {
    private T[] pila;
    private int tope = -1;

    public Pila () {
        pila = (T[]) new Object[5];
    }

    public Pila (int tamaño) {
        pila = (T[]) new Object[tamaño];
    }

    public void push (T elemento) {
        if (pilaLlena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            pila[tope] = elemento;

        }
    }

    public T pop () {
        T dato = null;
        if (pilaVacia()) {
            System.out.println("Pila vacía");
            return null;
        } else {
            dato = pila[tope];
            tope--;
        }
        return dato;
    }

    public boolean pilaLlena () {
        return tope == pila.length - 1;
    }

    public boolean pilaVacia () {
        return tope == -1;
    }

    public String invierteCadena(String cadena) {
        String resultado = " ";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            pila.push(cadena.charAt(i));
        }
        while (!pilaVacia()) {
    }
    

}