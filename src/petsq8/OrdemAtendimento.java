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
public class OrdemAtendimento {
    private DadosDoPet inicio, fim;
    
    public OrdemAtendimento () {
        inicio=fim = null;
    }
    
    public boolean Vazio() {
        return (inicio==null);
    }
    
    public void NovoVazio() {
        inicio=fim=null;
    }
    
    public void Enfileirando(String Nom, int Idd, String Rac) {
        DadosDoPet NovoAtt = new DadosDoPet(Nom, Idd, Rac, null);
        if (inicio == null) {
            inicio = fim = NovoAtt;
        } else {
            fim.next=NovoAtt;
            fim=NovoAtt;
        }
    }
    
    public DadosDoPet Att_Rem() {
        if (Vazio()) {
            return null;
            }
        DadosDoPet Pet=inicio;
        inicio=inicio.next;
        return Pet;
        }
    
    public void ExibirAtt () {
        if (this.Vazio()) return;
        DadosDoPet primeiro = inicio;
        while (primeiro != null) {
            System.out.println("Pet: " + primeiro.Nome + " - " + "Idade: " + primeiro.Idade + " - " + "Raça: " + primeiro.Raça);
            primeiro = primeiro.next;
            }
        }
}
