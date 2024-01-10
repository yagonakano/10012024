import java.util.*;;
public class ifelse1 {
    public static void main(String[] args){
        boolean sair = false;
        Scanner scnPalavra = new Scanner(System.in);         //*Somente a instancia */
        String texto = "Doente de amor\r\n" +
            "Procurei remédio na vida noturna\r\n" +
            "Com a flor da noite\r\n" +
            "Em uma bote aqui na Zona Sul\r\n" +
            "A dor do amor\r\n" +
            "É com outro amor que a gente cura\r\n" +
            "Vim curar a dor\r\n" +
            "Deste mal de amor na Boate Azul\r\n" +
            "E quando a noite\r\n" +
            "Vai se agonizando no clarão da aurora\r\n" +
            "Os integrantes da vida noturna se foram dormir\r\n" +
            "E a dama da noite\r\n" +
            "Estava comigo também foi embora\r\n" +
            "Fecharam-se as portas\r\n" +
            "Sozinho de novo tive que sair\r\n" +
            "Sair de que jeito\r\n" +
            "Se nem sei o rumo para onde vou\r\n" +
            "Muito vagamente me lembro que estou\r\n" +
            "Em uma boate aqui na Zona Sul\r\n" +
            "Eu bebi demais\r\n" +
            "E não consigo me lembrar sequer\r\n" +
            "Qual era o nome daquela mulher\r\n" +
            "A flor da noite da Boate Azul\r\n" +
            "Hoje meus dias são de tristeza e solidão\r\n" +
            "Trago em minha alma uma profunda conformação\r\n" +
            "Renunciei meu grande amor um dia\r\n" +
            "Nos braços dela em que tão triste eu dizia\r\n" +
            "Beijando os lábios do meu amor com frenesi\r\n" +
            "Não chores, por favor, porque preciso partir\r\n" +
            "Esse foi o meu ultimo beijo\r\n" +
            "Satisfiz o meu desejo\r\n" +
            "O pior foi te perder\r\n" +
            "Resignemos, oh, querida\r\n" +
            "Não lamentemos a vida\r\n" +
            "Nosso destino é sofrer\r\n" +
            "Saudade, palavra triste\r\n" +
            "Quando se perde um grande amor\r\n" +
            "Na estrada longa da vida\r\n" +
            "Eu vou chorando a minha dor\r\n" +
            "Igual uma borboleta\r\n" +
            "Vagando triste por sobre a flor\r\n" +
            "Teu nome sempre em meus lábios\r\n" +
            "Irei chamando por onde for\r\n" +
            "Você nem sequer se lembra\r\n" +
            "De ouvir a voz desse sofredor\r\n" +
            "Que implora por seus carinhos\r\n" +
            "Só um pouquinho do seu amor\r\n" +
            "Meu primeiro amor\r\n" +
            "Tão cedo acabou\r\n" +
            "Só a dor deixou\r\n" +
            "Nesse peito meu\r\n" +
            "Meu primeiro amor\r\n" +
            "Foi como uma flor\r\n" +
            "Que desabrochou e logo morreu\r\n" +
            "Nessa solidão\r\n" +
            "Sem ter alegria\r\n" +
            "O que me alivia são meus tristes ais\r\n" +
            "São prantos de dor\r\n" +
            "Que dos olhos caem\r\n" +
            "É porque bem sei\r\n" +
            "Quem eu tanto amei\r\n" +
            "Não verei jamais\r\n" +
            "(Brigado, gente, brigado, brigado) valeu";
             //*primeiro declara as variaveis ora depois abrir um looping */
            String palavra;
            int posicaoPalavra;
            while (sair == false) {
                System.out.println(texto);
                System.out.println("digite uma palavra ser pesquisada bo texto acima, depois tecle enter.");
                palavra = scnPalavra.nextLine();
                posicaoPalavra = texto.indexOf(palavra); //*indexOf metodo que pesquisa uma palvra em um texto e   o index é a posição */
                if(posicaoPalavra >= 0){
                    System.out.println("A palavra " + palavra + " foi encontrada na posição " + posicaoPalavra + " no texto acima");
                }
                else{
                System.out.println("Ops! Palavra não encontrada.");
                }
                System.out.println("Digite 'c' para continuar o 's' para sair, e depois aperte enter");
                if (scnPalavra.nextLine().equals("s")){  //* == nao funciona muito bem com strings, entao foi criado o 'equals' pra ser usado em string */
                    sair = true;

                }

            }
            scnPalavra.close();
        }
    
        
    }

