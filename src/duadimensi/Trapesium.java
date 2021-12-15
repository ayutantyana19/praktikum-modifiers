package duadimensi;

public class Trapesium {
    //Luas trapesium = 0.5 * (a+b) * t 
    public Double a;
    public Double b;
    public Double t;

    public Trapesium (Double inputa, Double inputb, Double inputTinggi){
        this.a = inputa;
        this.b = inputb;
        this.t = inputTinggi;
    }
    public Double luas(){
        return 0.5 * (a + b) * t;
    }
}
