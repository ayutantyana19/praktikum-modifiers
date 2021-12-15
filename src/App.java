import duadimensi.Jajargenjang;
import duadimensi.Lingkaran;
import duadimensi.Segitiga;
import duadimensi.Belahketupat;
import duadimensi.Trapesium;

import tigadimensi.Balok;
import tigadimensi.Kerucut;
import tigadimensi.Tabung;

public class App {
    public static void main(String[] args) throws Exception {
        Jajargenjang dimensi = new Jajargenjang(12.0, 15.0);
        System.out.println("Luas Jajargenjang = " + dimensi.luas());

        Lingkaran dimensi1 = new Lingkaran(10.0);
        System.out.println("Luas Lingkaran = " + dimensi1.luas());

        Segitiga dimensi2 = new Segitiga(4.0, 6.0);
        System.out.println("Luas Segitiga = " + dimensi2.luas());

        Belahketupat dimensi3 = new Belahketupat(20.0, 20.0);
        System.out.println("Luas Belahketupat = " + dimensi3.luas());

        Trapesium dimensi4 = new Trapesium(2.0, 4.0, 5.0);
        System.out.println("Luas Trapesium =" + dimensi4.luas());

        Kerucut dimensi5 = new Kerucut(4.0, 8.0);
        System.out.println("Volume Kerucut = " + dimensi5.volume());

        Tabung dimensi6 = new Tabung(6.0, 8.0);
        System.out.println("Volume Tabung = " + dimensi6.volume());

        Balok dimensi7 = new Balok(5.0, 3.0, 4.0);
        System.out.println("Volume Balok =" + dimensi7.volume()); 
    }
}