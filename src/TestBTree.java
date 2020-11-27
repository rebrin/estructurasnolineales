public class TestBTree {
    public static void main(String[] args) {
        BTree arbol=new BTree();
        arbol.insertar(3);
        arbol.insertar(2);
        arbol.insertar(1);
        arbol.insertar(4);
        arbol.insertar(5);
        System.out.println ("preorden");
        arbol.preOrden(arbol.root);

        System.out.println("inorden");
        arbol.inOrden(arbol.root);

        System.out.println("posorden");
        arbol.postOrden(arbol.root);
        System.out.println();

        System.out.println("------------------------------anchura");
        arbol.anchura();
        System.out.println("-----------busqueda---------");
        System.out.println(arbol.busca(arbol.root, 5));
    }
}
