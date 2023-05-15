
package arbolesbinarios;

public class NodoArbol {
    private int valor;
    private NodoArbol izq;
    private NodoArbol der;
    public NodoArbol(int valor){
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public NodoArbol getIzq(){
        return izq;
    }
    public NodoArbol getDer(){
        return der;
    }
    
    public void insertar(int _valor){
        if(_valor < this.valor){
            if(this.izq == null){
                this.izq = new NodoArbol(_valor);
            }else{
                this.izq.insertar(_valor);
            }
        }else{
            if(this.der == null){
                this.der = new NodoArbol(_valor);
            }else{
                this.der.insertar(_valor);
            }
        }
    }
}
