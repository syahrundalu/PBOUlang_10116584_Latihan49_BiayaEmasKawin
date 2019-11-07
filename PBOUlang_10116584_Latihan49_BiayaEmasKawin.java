/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan49_biayaemaskawin;

/**
 *
 * @author
 * NAMA : Muhammad Syahrun Dalu
 * NIM : 10116584
 */
public class PBOUlang_10116584_Latihan49_BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmasKawin x = new BiayaEmasKawin();
        
        x.setHargaPerGram(570000);
        x.setBeratEmas(15.7);
        
        System.out.println("Harga Pergram Bulan Oktober : Rp."+x.getHargaPerGram());
        System.out.println("Jumlah Gram yang Mau di beli : "+x.getBeratEmas());
        System.out.println("Total Harga : Rp."+x.hargaTotal());
    }
    
}
