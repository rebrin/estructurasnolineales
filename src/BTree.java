import java.util.LinkedList;
import java.util.Queue;

public class BTree {
    Nodo root;

    public BTree(){
        root=null;
    }
    
    public int visit(Nodo n){
        return n.key;
    }

    public void insertar(int el){
        Nodo p=root,prev=null;
        while (p!=null){
            prev=p;
            if(p.key < el)
                p=p.right;
            else
                p=p.left;
        }
        if(root==null) //solo un elemento
            root=new Nodo(el);
        else if(prev.key<el) //cuando mas de un
            prev.right=new Nodo(el);
        else
            prev.left=new Nodo(el);
    }

    public void preOrden(Nodo n){
        Nodo p=n;
        if(p!=null){
            System.out.print(visit(p)+" ");
            preOrden(p.left);
            preOrden(p.right);
        }
    }

    public void inOrden(Nodo n){
        Nodo p=n;
        if(p!=null){
            inOrden(p.left);
            System.out.print( visit(p)+" ");
            inOrden(p.right);
        }
    }

    public void postOrden(Nodo n){
        Nodo p=n;
        if(p!=null){
            postOrden(p.left);
            postOrden(p.right);
            System.out.print(visit(p)+" ");
        }
    }

    public void anchura(){
        Nodo p=root;
        Queue<Nodo> cola=new LinkedList<>();
        if(p!=null){
            cola.add(p);
            while(!cola.isEmpty()){
                p=cola.remove();
                System.out.print(visit(p)+" ");
                if(p.left!=null)
                    cola.add(p.left);
                if(p.right!=null)
                    cola.add(p.right);
            }
            System.out.println();
        }
    }

    public boolean busca(Nodo p,int el){
        while(p!=null){
            //verificar si es igual al primer elemento
            if(p.key==el)
                return true;
            else{
                if(el>p.key)
                    p=p.right;
                else
                    p=p.left;
            }
        }
        return false;
    }

}
