package duadimensi;

public class Segitiga {
    //luas segitiga = alas * tinggi / 2
    public Double alas;
    public Double tinggi;

    public Segitiga(Double alas, Double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

   
    public Double luas() {
        return (alas * tinggi) / 2;
    }
}
