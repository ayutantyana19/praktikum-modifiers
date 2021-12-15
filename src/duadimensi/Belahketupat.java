package duadimensi;

public class Belahketupat {
    // luas Belah ketupat = d1 * d2 / 2
    public Double d1;
    public Double d2;

    public Belahketupat(Double inputdiagonal1, Double inputdiagonal2){
        this.d1 = inputdiagonal1;
        this.d2 = inputdiagonal2;

    }
    
    public Double luas(){
        return d1 * d2 /2;
    }
    
}
