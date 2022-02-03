package Herencias.Lista;

import java.util.ArrayList;

public class Cola implements iLista{
    private ArrayList<String> cola;
    private final int capacidadMax =10;
    //===========================================CONSTRUCTOR=====================================================
    public Cola(ArrayList<String> cola) {
        this.cola = cola;
    }
    public Cola(){
        this.cola = new ArrayList<String>();
    }
    //=========================================GETTER Y SETTER===================================================
    public ArrayList<String> getCola() {
        return cola;
    }
    public void setCola(ArrayList<String> cola) {
        this.cola = cola;
    }
    //============================================METHODS========================================================

    @Override
    public String toString() {
        return this.cola.toString();
    }

    @Override
    public boolean isEmpty() {
        return this.cola.isEmpty();
    }

    @Override
    public boolean push(String push) {
        boolean isPushed;
        if(this.cola.size()<capacidadMax) {
            this.cola.add(push);
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
            poped=this.cola.get(0);
            this.cola.remove(0);
        }else{
            poped="";
        }
        return poped;
    }
}
