/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
import java.math.BigInteger;
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
        
        BigInteger hasil = fibo(n);
        tampilHasil (n, hasil);
    }
    
    private static int tampilInput() {
        Scanner baca = new Scanner(System.in);
        
            System.out.print("Bilangan ke-: ");
            int n = baca.nextInt();
            
            return n;
    }
    
    private static BigInteger fibo(int n) {
        
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for ( int i = 2; 1 < n; i++)
        {
            hasil[i] = hasil[i=1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    
    private static void tampilHasil(int n, BigInteger hasil)
    {
        System.out.println("Bilanagn Fibonacci ke-" + n + " : " + hasil);
    }
}
