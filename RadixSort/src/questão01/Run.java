package questão01;

import java.util.stream.Stream;
import util.Arquivo;
import util.ErroDeLeituraException;

public class Run {
    public static void main(String[] args) {
        String arquivo = "src\\entrada\\dados.txt";
        String[] dados;
        Fila<String> fila = new Fila<>();
        Radix radix = new Radix();

        try{
            dados = Arquivo.ler(arquivo);
        }
        catch (ErroDeLeituraException e){
            System.out.println("Erro na leitura do arquivo: " + e);
            return;
        }
        
        for (int i = 0; i < dados.length; i++){
            fila.adiciona(dados[i]);
            System.out.println(dados[i]);
        }
        
        int n = dados.length;
        int [] dadosInt = Stream.of(dados).mapToInt(Integer::parseInt).toArray();
        
        long start = System.currentTimeMillis();

        radix.radixsort(dadosInt, n);
        
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("\nO Algoritmo executou em " + elapsed + " ms.");
        
    }
}