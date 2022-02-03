package Arrays;
import java.util.Random;
import java.util.Arrays;

public class Ratas_16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int pesoRatas[] = new int[20];

        int ratitas= 0;
        int ratas= 0;
        int ratotas= 0;
        int ratos =0;
        int media= 0;

        for(int pos = 0; pos<pesoRatas.length; pos++){
            pesoRatas[pos]= rand.nextInt(500-150) +150;
        }

        for(int pos =0; pos<pesoRatas.length; pos++){
            if(pesoRatas[pos]<200){
                ratitas++;
            }else if(pesoRatas[pos]>=200 &&pesoRatas[pos]<300){
                ratas++;
            }else if(pesoRatas[pos]>=300 &&pesoRatas[pos]<400){
                ratotas++;
            }else if(pesoRatas[pos]>=400){
                ratos++;
            }else{
                System.out.println("QUE ES ESTO SIQUIERA???");
            }
        }

        for(int pos=0; pos<pesoRatas.length;pos++ ){
            media += pesoRatas[pos];
        }
            media /= pesoRatas.length;
        //Imprime los resultados de los pesos de las ratas
        System.out.println(Arrays.toString(pesoRatas));
        System.out.println("Hay " + ratitas + " ratitas (<200gr)");
        System.out.println("Hay " + ratas + " ratas (>200gr, <300gr)");
        System.out.println("Hay " + ratotas + " ratotas (>300gr, <400gr)");
        System.out.println("Hay " + ratos + " ratos (>400gr)");
        System.out.println("La media de los cacho de trozo de ratas es de: " + media + " gramos");
    }
}
