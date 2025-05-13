/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios26;

import java.io.FileReader;
import java.io.IOException;

/**
 *  public  static void verificarIdade(int idade) {
        if (idade < 18) {
            //aqui eu crei a exception quando a idade e menor que 18 
            throw new IllegalArgumentException("A idade deve ser maior ou igual a 18!");
        }
        System.out.println("Acesso permitido.");
    }

    public static void main(String[] args) {
        try {
        verificarIdade(18); // Vai lançar uma exceção 
        
        }catch (Exception error){
        System.out.println("deu ruim " + error.getMessage());
        
        }
        
        
        
    }try {
            // O código abaixo pode lançar uma IOException, então precisa ser tratado
            FileReader arquivo = new FileReader("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        } // este e para a pesquisa de arquivo
        System.out.println("eu quero ir emboraaaa");
 * @author FRELIANNYSISMELIALOP
 */
public class Exercicios26 {

  
    public static void main(String[] args) {
        
    }
}
    
    
    
    
    
    
    

