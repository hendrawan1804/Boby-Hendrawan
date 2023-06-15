/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author boby

 */
public class MainKinetic {
    double massa, kecepatan;
    

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double hitungEnergiKinetic(){
        double energiKinetic = 0.5 * massa * kecepatan * kecepatan;
        return energiKinetic;
        
    }
        public static void main(String[] args) {
            MainKinetic sepeda = new MainKinetic();
            sepeda.setMassa(20);
            sepeda.setKecepatan(2);
            
            double energiKinetic = sepeda.hitungEnergiKinetic();
            
            System.out.println(sepeda.getMassa());
            System.out.println(sepeda.getKecepatan());
            System.out.println(energiKinetic);
   
        }
}
        

