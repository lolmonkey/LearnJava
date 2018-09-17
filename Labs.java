package labs;
import javax.swing.JOptionPane;

public class Labs {
    public static void main(String[] args) {
        RumusPersegi L = new RumusPersegi();       
        int A; 
        String strA = JOptionPane.showInputDialog ("Masukan nilai untuk sisi persegi: ");
        A = Integer.parseInt(strA);
        JOptionPane.showMessageDialog(null, "Luas dari persegi adalah: " + L.luas(A));
    }
}    
