package com.grafos;

import java.util.ArrayList;

public class Nodo {
    ArrayList<Nodo> lAdy;
    Nodo Padre;
    String info;

    public Nodo(String info){
        this.info=info;
        Padre=null;
        lAdy=new ArrayList<Nodo>();
    }
}
