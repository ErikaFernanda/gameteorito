/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pasta {
    
    public  Pasta() throws FileNotFoundException, IOException{
        File arquivos[];
        File diretorio = new File ("/Z/fernandaerika/Compartilhado/ukooa");
        arquivos = diretorio.listFiles();
        
        for (File ler : arquivos) {
                System.out.println(ler.getName());
                FileInputStream arquivo = new FileInputStream(diretorio+"/"+ler.getName());
                InputStreamReader ler2 = new InputStreamReader(arquivo);
                BufferedReader br = new BufferedReader(ler2);
                String linha = br.readLine();
                while (linha !=null){
                    
                    System.out.println(linha.substring(1, 5));
                    linha = br.readLine();
                    }
        
    }
    
    
}
    
    
    
    public static void main(String[] args) throws IOException  {
        
        
         Pasta abrir = new Pasta();
        
       
            
        
    
}
}

        
       