public class Nodo {
    public int key;
    public Nodo left,right;

    public Nodo(){
        left=right=null;
    }
    public Nodo(int e){
        this(e,null,null);
    }
    public Nodo(int el, Nodo l, Nodo r){
        key=el;
        left=l;
        right=r;
    }

}
