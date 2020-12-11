package abb;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        //insertar elementos
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        //mostramos antes de ordenar
        System.out.println("Recorriendo preOrden:");
        abb.mostrarpreOrden();
        System.out.println();
        //mostramos en orden
        System.out.println("Recorriendo inOrden:");
        abb.mostrarInOrden();
        //mostramos despues de ordenar
        System.out.println("Recorriendo postOrden");
        abb.mostrarpostOrden();


    }
}
