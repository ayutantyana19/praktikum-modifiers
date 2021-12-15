package tigadimensi;

import duadimensi.Lingkaran;

public class Tabung extends Lingkaran{
    //Volume Tabung = phi * jari * jari * tinggi
    Double tinggi;

    public Tabung(Double jari, Double inputtinggi) {
        super(jari);
        this.tinggi = inputtinggi;
    }

    public Double volume() {
        return super.luas() * tinggi;
    }
}
