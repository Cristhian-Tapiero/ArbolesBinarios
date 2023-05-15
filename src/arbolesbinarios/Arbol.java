package arbolesbinarios;

public class Arbol {
    NodoArbol inicial;
    public Arbol(){
        this.inicial = null;
    }
    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial = new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    public void dispararPreorden(){
        this.preorden(this.inicial);
    }
    public void preorden (NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            System.out.print(nodo.getValor() + ",");
            preorden(nodo.getIzq());
            preorden(nodo.getDer());
        }
    }
    public void dispararInorden(){
        this.inorden(this.inicial);
    }
    public void inorden (NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            inorden(nodo.getIzq());
            System.out.print(nodo.getValor() + ",");
            inorden(nodo.getDer());
        }
    }
    public void dispararPostOrden(){
        this.postorden(this.inicial);
    }
    public void postorden (NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            postorden(nodo.getIzq());
            postorden(nodo.getDer());
            System.out.print(nodo.getValor() + ",");
        }
    }

}
