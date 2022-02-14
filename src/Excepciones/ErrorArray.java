package Excepciones;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ErrorArray {
    public static ArrayList<Integer> arraylist = new ArrayList<Integer>();

    public ErrorArray() {
        for(int i =0; i<10; i++){
            arraylist.add(i);
        }
    }

    public static void main(String[] args) {
        ErrorArray errorArray = new ErrorArray();
        try{
            errorArray.imprimirArray();
        }catch(IndexOutOfBoundsException error){
            System.out.println("bona tarde");
        }
    }
    public void imprimirArray(){
        String res ="";
        for(int i=0; i<=arraylist.size();i++){
            res += arraylist.get(i) +"\n";
        }
        System.out.println(res);
    }
}


