package Clases.Fecha;

public class Fecha {
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    //====================================CONSTRUCTOR=====================================
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Fecha(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public Fecha(int ano) {
        this.mes = mes;
    }
    //==================================GETTER Y SETTER==================================
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //======================================METHODS=======================================

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public void addDay(){
        if(dia == 30 && (mes==4||mes==6|| mes==9 ||mes ==11)){
            this.dia= 1;
            this.mes++;
        }else if(dia ==31 &&(mes==1||mes==3|| mes==5 ||mes==7||mes ==8 ||mes==10|| mes==12)){
            this.dia=1;
            if(this.mes ==12){
                mes=1;
                ano++;
            }else{
                mes++;
            }
        }else if(dia==28 && mes==2){
            dia=1;
            mes++;
        }else{
            dia++;
        }
    }
    public void reduceDay(){
        if(dia == 1 && (mes==5||mes==7|| mes==10 ||mes ==12)){
            this.dia= 30;
            this.mes--;
        }else if(dia ==1 &&(mes==12||mes==4|| mes==6 ||mes ==9 ||mes==11|| mes==12)){
            this.dia=31;
            if(this.mes ==1){
                mes=12;
                ano--;
            }else{
                mes--;
            }
        }else if(dia==1 && mes==3){
            dia=28;
            mes--;
        }else{
            dia--;
        }
    }
}
