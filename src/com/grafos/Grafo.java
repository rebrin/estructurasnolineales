package com.grafos;

import java.util.ArrayList;

public class Grafo {
    public Grafo(){}

    public void conectar(Nodo a,Nodo b){
        //poner en la lista a, b y b,a
        if(!a.lAdy.contains(b))
            a.lAdy.add(b);
        if(!b.lAdy.contains(a))
            b.lAdy.add(a);
    }

    public boolean graph_search(Nodo ini, Nodo sol){
        ArrayList<Nodo> frontera=new ArrayList<>();
        ArrayList<Nodo> explorados=new ArrayList<>();
        frontera.add(ini);
        while(true){
            if(frontera.isEmpty())
                return false;
            Nodo s=frontera.remove(0);
            if(s==sol){
                //regresar el camino hasta el padre
                System.out.println(path(s));
                return true;
            }else{
                explorados.add(s);
                for (Nodo hijo:s.lAdy) {
                    if(!explorados.contains(hijo)
                            &&!frontera.contains(hijo)){
                        frontera.add(hijo);
                    hijo.Padre=s;
                    }
                }
            }
        }
    }

    private String path(Nodo s) {
    String cad=s.info;
    while(s.Padre!=null){
        cad=s.Padre.info+"-"+cad;
        s=s.Padre;
    }
    return cad;
    }
}
