/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
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
        
        int n = tampilInput();
    }
    
    private static int tampilInput() {
        Scanner baca = new Scanner(System.in);
        
            System.out.print("Bilangan ke-: ");
            int n = baca.nextInt();
            
            return n;
    }
}
