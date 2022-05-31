package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import questão01.Fila;


public class Arquivo {
    public static String[] ler(String arquivo) throws ErroDeLeituraException{
        try{
            String linha;
            FileReader file = new FileReader(arquivo);
            BufferedReader ler = new BufferedReader(file);
            Fila<String> fila = new Fila<>();

            do{
                linha = ler.readLine();
                if (linha != null) fila.adiciona(linha);
            } while (linha != null);

            String[] dados = new String[fila.getTamanho()];

            for (int i = 0; i < dados.length; i++){
                dados[i] = fila.remove();
            }

            return dados;
        }
        catch (IOException e){
            throw new ErroDeLeituraException();
        }
    }
    
    public static void escrever(String arquivo, String[] dados) throws ErroDeEscritaException{
        try{
            FileWriter escrever = new FileWriter(arquivo);

            for (int i = 0; i < dados.length; i++){
                escrever.write(dados[i]);
            }

            escrever.close();
        }
        catch (IOException e){
            throw new ErroDeEscritaException();
        }
    }
    
}