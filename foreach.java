public class foreach {
    public static void main(String[] args) {
    String[] frutas = {"Lichia","Cereja","Laranja","Pitaia","Limão","Marácuja"};
    System.out.println("Você tem [ " + frutas.length + " ] frutas cadastradas");
    for (int f = 0; f < frutas.length; f++) {
        System.out.println("Você tem a fruta - " + frutas[f] + ", cadastrada com sucesso.");
    }       
    }
    
}
