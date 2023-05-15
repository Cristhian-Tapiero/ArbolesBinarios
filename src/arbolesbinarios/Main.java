package arbolesbinarios;

public class Main {
    public static void main(String[]args){
        Arbol arbol = new Arbol();
        arbol.insertar(12);
        arbol.insertar(82);
        arbol.insertar(13);
        arbol.insertar(54);
        arbol.insertar(5);
        arbol.insertar(20);
        System.out.print("Inorden: ");
        arbol.dispararInorden();
        System.out.println("");
        System.out.print("Post orden: ");
        arbol.dispararPostOrden();
        System.out.println("");
        System.out.print("Pre-orden: ");
        arbol.dispararPreorden();
    }
}
