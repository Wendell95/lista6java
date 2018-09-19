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
public class TesteQuestao2 {

    /**
     * @param args the command line arguments
     */
     //}
      // public static void teste() throws Exception{
    public static void main(String[] args) {
        String valor, msg; int soma = 0;
        int num1, num2;
        boolean continuar = true;
        try{
   
        metodoA();
       valor = JOptionPane.showInputDialog(null,"Digite um numero:", "Entrada de dadados",JOptionPane.QUESTION_MESSAGE);
       num1 = Integer.parseInt(valor);
       valor = JOptionPane.showInputDialog(null,"Digite outro numero:", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
       num2 = Integer.parseInt(valor);
       soma = (num1+num2)/2;
       msg = String.format("Resultado da soma %d", soma);
       JOptionPane.showMessageDialog(null,msg);
       continuar=false;
           }
       catch(NovaExcecaoExceptionQuestao2 e){
       System.err.println(e);
                if (soma > 100){
                    JOptionPane.showMessageDialog(null, "Programa encerrado");
                }
            }
    }public static void metodoA() throws NovaExcecaoExceptionQuestao2{
     throw new NovaExcecaoExceptionQuestao2(2);
     }}
