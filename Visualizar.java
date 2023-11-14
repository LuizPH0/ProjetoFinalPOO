package javaprojetofinal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz Hatem
 */
public class Visualizar {
    private Usuario espectador;
    private Video filme;

    public Visualizar(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    
    public void avaliar(){
    this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
    this.filme.setAvaliacao(nota);
    } 
    
    public void avaliar(double porc){
    int tot = 0;
        if (porc < 20) {
            tot = 3;
        } else if (porc <= 50) {
        tot = 5;
        }else if (porc <= 90){
        tot = 8;
        }else{
        tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizar{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
