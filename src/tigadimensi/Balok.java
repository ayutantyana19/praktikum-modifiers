package tigadimensi;

import duadimensi.PersegiPanjang;

public class Balok extends PersegiPanjang {
    // volume balok = p * l * t 
    Double t;

    public Balok(Double inputpanjang, Double inputlebar, Double inputTinggi){
        super(inputpanjang, inputlebar);
        this.t = inputTinggi;   
    }
    

    public Double volume(){
        return super.luas() * t; 
    }
}


