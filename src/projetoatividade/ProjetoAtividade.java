/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoatividade;


public class ProjetoAtividade {


    public static void main(String[] args) {
        
        NewJFrame formulario = new NewJFrame();
        
        Pessoa cliente = new Pessoa (1232, formulario.nome, formulario.cpf, formulario.endereço, formulario.cidade, formulario.estado);
        

    }
    
}
