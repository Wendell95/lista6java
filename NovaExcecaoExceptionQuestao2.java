/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tratamentodeexcecao;

/**
 *
 * @author PC
 */

    public class NovaExcecaoExceptionQuestao2 extends Exception {
private int valor;
public NovaExcecaoExceptionQuestao2(){}
public NovaExcecaoExceptionQuestao2(int va){
valor = va;
}
public String toString(){
return "Nova excecão̧ " + valor;
}}
