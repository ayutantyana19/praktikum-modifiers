package tigadimensi;

import duadimensi.Lingkaran;

public class Kerucut extends Lingkaran {
    //  Volume kerucut = 0.33 * phi * r * r * t
    final Double sepertiga = 0.33;
    final Double phi = 3.14; 
    Double tinggi;
    

    public Kerucut(Double jari, Double inputtinggi) {
        super (jari);
        this.tinggi = inputtinggi;
        
    }

    public Double volume() {
        return sepertiga * super.luas() * tinggi;
    }
}
