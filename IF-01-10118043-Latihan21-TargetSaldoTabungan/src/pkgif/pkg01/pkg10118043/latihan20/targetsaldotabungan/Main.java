/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan20.targetsaldotabungan;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setCurrencySymbol("Rp. ");
        simbol.setGroupingSeparator('.');
        
        DecimalFormat pembulatan = (DecimalFormat)DecimalFormat.getCurrencyInstance();
        pembulatan.setDecimalFormatSymbols(simbol);
        pembulatan.setMaximumFractionDigits(0);
                
        // TODO code application logic here
        double saldo,saldotarget,bunga;
        saldo = 3500000;
        bunga = 0.08;
        saldotarget = 6000000;
        
        int i;
        i = 1;
        while(saldo <= saldotarget){
            saldo = saldo + (saldo * bunga);
            System.out.println("Saldo di bulan ke"+i+" "+pembulatan.format(saldo));
            i++;
            
        }
                
       
        
    }
    
}
