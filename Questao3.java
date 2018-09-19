/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tratamentodeexcecao;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result, msg; int indice = 0;
        boolean continuar=true;
        int array[] = {127, 34, 77, 13, 99, 1, 2, 4, 5,6};
do{
    try{
        result = JOptionPane.showInputDialog(null,"Digite uma posição de 0 a 9:",
"Entrada de dados", JOptionPane.QUESTION_MESSAGE);
indice = Integer.parseInt(result);
msg = String.format("Conteudo na posição %d: %d",indice,array[indice]);
JOptionPane.showMessageDialog(null,msg);
continuar=false;
    }catch(ArrayIndexOutOfBoundsException e){
        System.err.println(e);
        if (indice > 9){
            JOptionPane.showMessageDialog(null, "Posicao inexistente");
        }
        
    }catch (NumberFormatException e) {
        System.err.println(e);
        JOptionPane.showMessageDialog(null, "valor nao e numero");

    

}
}while(continuar);
}
}