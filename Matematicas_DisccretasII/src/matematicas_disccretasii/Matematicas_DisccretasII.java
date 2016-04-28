/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas_disccretasii;

import java.util.Scanner;

/**
 *
 * @author luisgemc
 */
public class Matematicas_DisccretasII {

    public int tamano;
    public int [][] matriz;
    public Scanner in;
    
    public Matematicas_DisccretasII()
    {
        this.in= new Scanner(System.in);
    }
    public void ingresar()
    {
        for(int r=0; r<this.tamano; r++)
        {
            for (int s=0; s<this.tamano;s++)
            {
                System.out.println("Ingrese la posicion ["+r+"] ["+s+"]: " );
                this.matriz[r][s]=this.in.nextInt();
            }
        }
    }
    
    public void imprimir()
    {
         for(int r=0; r<this.tamano; r++)
        {
            for (int s=0; s<this.tamano;s++)
            {
                
                System.out.println("Elemento ["+r+"] ["+s+"]: "+matriz[r][s] );
            }
            
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematicas_DisccretasII m = new Matematicas_DisccretasII();
        
        // TODO code application logic here
        System.out.println("Ingrese el tamanio: ");
        m.tamano = m.in.nextInt();
        m.matriz= new int[m.tamano][m.tamano];
        m.ingresar();
        m.imprimir();
    }
    
}
