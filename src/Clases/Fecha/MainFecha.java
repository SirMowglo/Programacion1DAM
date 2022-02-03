package Clases.Fecha;

public class MainFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(10,1,1998);
        if(fecha.getMes()>12){
            fecha.setMes(12);
        }
        if(fecha.getMes()<1){
            fecha.setMes(1);
        }
        if (fecha.getDia()<1){
            fecha.setDia(1);
        }
        if(fecha.getDia()>30 && (fecha.getMes()==4||fecha.getMes()==6|| fecha.getMes()==9 ||fecha.getMes() ==11)){
            fecha.setDia(30);
        }
        if(fecha.getDia() ==31 &&(fecha.getMes()==1||fecha.getMes()==3|| fecha.getMes()==5 ||fecha.getMes() ==7||fecha.getMes() ==8 ||fecha.getMes()==10|| fecha.getMes()==12)) {
            fecha.setDia(31);
        }
        if(fecha.getDia() ==28 && (fecha.getMes()==2)){
            fecha.setDia(28);
        }
    }
}
