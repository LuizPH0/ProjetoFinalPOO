/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprojetofinal;

/**
 *
 * @author Luiz Hatem
 */
public class JavaProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[4];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de Polimorfismo");
        v[2] = new Video("Aula de Herança");
        v[3] = new Video("Aula de Java");
       // System.out.println(v[0].toString());
        
        Usuario g[] = new Usuario[2];
        g[0] = new Usuario("João ", "Masc ", 20, " João_boladão");
        g[1] = new Usuario("Ana", "Fem", 20, "AninhaBolada444");
        //System.out.println(g[0].toString());
        
        Visualizar v1[] = new Visualizar[5];
        v1[0] = new Visualizar(g[0], v[2]);
        v1[0].avaliar(10);
        System.out.println(v1[0].toString());
        System.out.println(" ");
        v1[1] = new Visualizar(g[0], v[1]);
        v1[1].avaliar(9);
        System.out.println(v1[1].toString()); //João assiste Aula de Polimorfismo
        v1[2] = new Visualizar(g[1], v[1]);
        v1[2].avaliar();
        System.out.println(v1[2].toString());
        
    }
    
}
