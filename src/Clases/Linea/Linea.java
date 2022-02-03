package Clases.Linea;

public class Linea {
    private Punto p1;
    private Punto p2;


    //====================================CONSTRUCTOR======================================
    public Linea(Punto point1, Punto point2) {
        this.p1 = point1;
        this.p2 = point2;
    }

    public Linea(double x1, double y1, double x2, double y2) {
        this.p1 =new Punto(x1,y1);
        this.p2 =new Punto(x2,y2);
    }

    public Linea(double x2, double y2) {
        this.p1 =new Punto(0,0);
        this.p2 =new Punto(x2,y2);
    }

    //==================================GETTER Y SETTER====================================
    public Punto getP1() {
        return p1;
    }
    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    public void setP1(double x1, double y1) {
        this.p1.setCoordX(x1);
        this.p1.setCoordY(y1);
    }

    public Punto getP2() {
        return p2;
    }
    public void setP2(Punto p2) {
        this.p2 = p2;
    }
    public void setP2(double x2, double y2) {
        this.p2.setCoordX(x2);
        this.p2.setCoordY(y2);
    }
    //======================================METHODS========================================
    public void moveLeft(double amount){
        this.p1.displaceX(-amount);
        this.p2.displaceX(-amount);
    }
    public void moveRight(double amount){
        this.p1.displaceX(amount);
        this.p2.displaceX(amount);
    }
    public void moveUp(double amount){
        this.p1.displaceY(amount);
        this.p2.displaceY(amount);
    }
    public void moveDown(double amount){
        this.p1.displaceY(-amount);
        this.p2.displaceY(-amount);
    }

    @Override
    public String toString() {
        return "["+p1.toString()+ "," +p2.toString()+"]";
    }
}
