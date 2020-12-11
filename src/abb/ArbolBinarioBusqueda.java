package abb;

public class ArbolBinarioBusqueda {
     private Nodo raiz;

     public ArbolBinarioBusqueda(){
         raiz= null;
     }
     /*
     Arbol esta vacio o no
      */
    public boolean estaVacio(){
        return raiz == null;
    }

    /*
    Metodo recursivo para insertar un nodo a nuestro abb
     */
    private  void  insertar(Nodo padre, Nodo hijo, int dato){
        if (hijo == null) {//caso base
            Nodo nuevo = new Nodo(null, dato, null);
            if (dato >= padre.getDato()) {
                padre.setDerecho(nuevo);
            } else {
                padre.setIzquierdo(nuevo);
            }
        }else{//llamda recursividad
            if (dato>=padre.getDato()){
                    insertar(hijo, hijo.getDerecho(), dato);
            } else {
                    insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }

    /*
    Metodo auxiliar para insertar un nuevo nodo al abb
     */
    public   void  insertar(int dato){
        if (estaVacio()){
            Nodo nuevo= new Nodo(null, dato, null);
            raiz = nuevo;
        }else {
            if (dato >= raiz.getDato()){
                insertar(raiz, raiz.getDerecho(), dato);
            }else{
                insertar(raiz, raiz.getIzquierdo(), dato);
            }
        }
    }
    //Metodo mostrarPreOrden
    private void mostrarpreOrden(Nodo nodo) {
        if (nodo!= null){
            System.out.print(nodo.getDato()+"");
            mostrarpreOrden(nodo.getIzquierdo());
            mostrarpreOrden(nodo.getDerecho());
        }
    }
    //Metodo mostrarInOrden
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){ //caso base

        }else { //llamada recursiva
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    //mostrar postOrden
    private void mostrarpostOrden(Nodo nodo){
        if (nodo!= null){
            mostrarpostOrden(nodo.getIzquierdo());
            mostrarInOrden(nodo.getDerecho());
            System.out.print(nodo.getDato()+" ");
        }
    }
    public void mostrarpreOrden(){
        this.mostrarpreOrden(this.raiz);
    }
    public void mostrarInOrden(){
        Nodo tem = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
    public void mostrarpostOrden(){
        this.mostrarpostOrden(this.raiz);
    }
}
