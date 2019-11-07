/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan49_biayaemaskawin;

/**
 *
 * @author syhar
 */
public class BiayaEmasKawin{
    private double totalHarga;
    private double beratEmas;
    private int hargaPerGram;

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }

    public void setHargaPerGram(int hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }  
    
    public double hargaTotal(){
    return beratEmas * hargaPerGram;
    
}    
    
}
