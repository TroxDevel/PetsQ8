/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsq8;

/**
 *
 * @author Luiz Pereira
 */
public class DadosDoPet {
    public String Nome;
    public int Idade;
    public String Raça;
    public DadosDoPet next;
    
    DadosDoPet(String Nom, int Idd, String Rac, DadosDoPet prox) {
        this.Nome = Nom;
        this.Idade = Idd;
        this.Raça = Rac;
        this.next = prox;
    }
    
}
