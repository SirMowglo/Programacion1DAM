package Herencias.Lista;

import java.util.ArrayList;

public class Pila implements iLista{
    private ArrayList<String> pila;
    private final int capacidadMax =10;


    //===========================================CONSTRUCTOR=====================================================
    public Pila(ArrayList<String> pila) {
        this.pila = pila;
    }

    public Pila() {
        this.pila = new ArrayList<String>();
    }

    //=========================================GETTER Y SETTER===================================================
    public ArrayList<String> getPila() {
        return pila;
    }
    public void setPila(ArrayList<String> pila) {
        this.pila = pila;
    }
    //============================================METHODS========================================================

    @Override
    public String toString() {
        String res="";
        for(int i =0; i< this.pila.size();i++){
            res += this.pila.get(i) + '\n';
        }
        return res;
    }

    @Override
    public boolean isEmpty() {
        return this.pila.isEmpty();
    }

    @Override
    public boolean push(String push) {
        boolean isPushed;
        if(pila.size()<capacidadMax) {
            this.pila.add(0,push);
            isPushed=true;
        }else{
            isPushed=false;
        }
        return isPushed;
    }

    @Override
    public String pop() {
        String poped;
        if(!this.isEmpty()){
            poped= pila.get(0);
            this.pila.remove(0);
        }else{
            poped="";
        }
        return poped;
    }
}
