package duadimensi;

public class Jajargenjang {
    // luas Jajar Genjang = alas * tinggi 
    public Double alas;
    public Double tinggi;

    public Jajargenjang(Double inputalas, Double inputtinggi){
        this.alas = inputalas;
        this.tinggi = inputtinggi;
    }

    public Double luas() {
        return alas * tinggi;

    }
    
}
