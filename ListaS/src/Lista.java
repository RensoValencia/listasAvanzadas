public class Lista {

    Nodo cabeza;
    
    Lista() {
        cabeza = null;
    }
    
    public boolean listaVacia() {
        return (cabeza == null) ? true : false;
    }
    
    public void insFrente(int dato) {
        
        Nodo nuevo = new Nodo(dato);
        
        if(listaVacia()) {
            cabeza = nuevo;
        } else {
            nuevo.sig = cabeza;
            cabeza = nuevo;
        }
    }
    
    public String recorre() {
        
        String s = "Lista\n";
        Nodo aux = cabeza;
        
        while(aux != null) {
            s +=aux.info + "\n";
            aux = aux.sig;
        }
        return s;
    }
}
