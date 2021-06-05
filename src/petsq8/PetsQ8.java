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
public class PetsQ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrdemAtendimento Add = new OrdemAtendimento();
        
        Add.Enfileirando("Dora", 1, "Hunsky Siberian");
        Add.Enfileirando("Box", 4, "Boxer Francês");
        Add.Enfileirando("Tótó", 50, "Não definida");
        Add.ExibirAtt();
    }
    
}
