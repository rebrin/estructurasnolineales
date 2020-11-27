package com.grafos;

import javax.print.attribute.standard.MediaSize;

public class Test {
    public static void main(String[] args) {
        Nodo NApatzingan=new Nodo("Apatzingan");
        Nodo NCheran=new Nodo("Cheran");
        Nodo NUruapan=new Nodo("Uruapan");
        Nodo NPatzcuaro=new Nodo("Patzcuaro");
        Nodo NQuiroga=new Nodo("Quiroga");
        Nodo NMorelia=new Nodo("Morelia");
        Nodo NPuruandiro=new Nodo("Puruandiro");
        Nodo NCDHidalgo=new Nodo("Ciudad Hidalgo");
        Nodo NZamora=new Nodo("Zamora");

        Grafo g=new Grafo();
        g.conectar(NApatzingan,NUruapan);
        g.conectar(NUruapan,NPatzcuaro);
        g.conectar(NPatzcuaro,NCheran);
        g.conectar(NPatzcuaro,NMorelia);
        g.conectar(NUruapan,NMorelia);
        g.conectar(NMorelia,NQuiroga);
        g.conectar(NMorelia,NPuruandiro);
        g.conectar(NMorelia,NCDHidalgo);

        System.out.println(g.graph_search(NPatzcuaro,
                NZamora));
    }
}
