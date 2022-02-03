package Arrays;

public class Paquete_01 {
    public static void main(String[] args) {
        //Crear array de 10 elementos y asignarle a cada elemento su posicion mas 1 y que lo imprima
        int[] num = new int[10];
        for(int i = 0; i<=9; i++){
            if(i%2==0){
                num[i]=(i+1)*-1;
            }else{
                num[i]=(i+1);
            }
            System.out.println(num[i]);
        }
    }
}
