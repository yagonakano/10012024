import java.util.*;
public class dowhile1 {
    public static void main(String[] args){
        int tempoTotal = 2000; // tempo em milissegundos
        int minutoContado = 0;
        int segundoContado = 0;
        while (minutoContado <= segundoContado){
            try{
                System.out.println("Assistindo filme, se passaram " + minutoContado + " minutos e " + segundoContado + " segundos");
                Thread.sleep(1000); // Contador de tempo, a cada 1 segundo (1000 milissegundos)
                segundoContado++;
                    if (segundoContado == 60){
                        minutoContado++;
                        segundoContado = 0;
                    }
            }
            catch (Exception e) {
                System.out.println("Ops! Ocorreu um erro.");
            }
        }
        System.out.println("Filme encerrado.");
    }

    
}
