/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tratamentodeexcecao;




import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
   
public static void main(String[] args) {
    
      
int[] x = new int[10];
boolean continuar=true;

    try{

for (int i = 0; i < x.length; i++)
{ x[i] = i;
} // laço para preencher o array
for (int i = 0; i <= x.length; i++)
{ Console.WriteLine((x[i]);
    
continuar=false;
}
    }
catch(Exception e){
        System.err.println(e);
        JOptionPane.showMessageDialog(null, "Erro");
        

}

 
}
}
        
    

