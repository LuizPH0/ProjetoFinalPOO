/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojetofinal;


public class Usuario extends Pessoa {
    private String login;
    private int totalAssistido;
    
   public Usuario(String nome, String sexo, int idade, String login) {
   super(nome, sexo, idade);
   this.login = login;
   this.totalAssistido = 0;
   }
    
    public void viuMaisUm(){
    
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Usuário{" +super.toString()+ " login=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
    
}
