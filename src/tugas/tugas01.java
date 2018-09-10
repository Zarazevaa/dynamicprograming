/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ZEVA
 */
public class tugas01 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("identitas ; " + identitas );
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    public static void main(String[] args) {
        String identitas = " nama lengkap / kelas / no";
        
        tampilJudul(identitas);
    }
}
