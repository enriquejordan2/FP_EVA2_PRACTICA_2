/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica_2;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_PRACTICA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        int p1,p2,p3,p4;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Pon el primer numero: ");
        n1 = captu.nextInt();
        System.out.println("Pon el segundo numero: ");
        n2 = captu.nextInt();
        p1 = n1 -1;
        p4 = n1 -1;
        p3 = n2 +1;
        p2 = n2 +1;
        if (n1<n2){
            for (int i = p1 + 1; i <= n2; i++){
                System.out.println(i);
                
            }
            for (int i = p2 - 1; i >= n1; i--){
                System.out.println(i);
            }
        }else if (n1>n2){
            for (int i = p4 + 1; i >= n2; i--){
                System.out.println(i);
            }
            for (int i = p3 - 1; i <= n1; i++){
                System.out.println(i);
            }    
                
        }
    }
    
}
