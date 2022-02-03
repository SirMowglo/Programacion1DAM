package Arrays;

public class Signos_09 {
    public static void main(String[] args) {
        int arraySignos[][] = new int [5][7];

        for (int pos = 0; pos<arraySignos.length; pos++){
            for(int pos2 =0; pos2<arraySignos[pos].length; pos2++){
                if(pos == 0 || pos == 4){
                    System.out.print("-");
                    if(pos2 == 6){
                        System.out.print("\n");
                    }
                }else{
                    System.out.print("+");
                    if(pos2 == 6){
                        System.out.print("\n");
                    }
                }

            }
        }
    }
}
