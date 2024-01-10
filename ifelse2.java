import java.util.*;

public class ifelse2 {
    public static void main (String[] args) {
        String strUsername = "teste";
        String strPassword = "teste";
        Scanner scnInput = new Scanner(System.in);
        System.out.println("Digite o nome de usuario:");
        String inUsername = scnInput.nextLine();
        System.out.println("Digite sua senha:");
        String inPassword = scnInput.nextLine();
            if (strUsername.equals(inUsername) && strPassword.equals(inPassword)){
            System.out.println("Login realizado com sucesso.");
            }
            else{
                System.out.println("Acesso inválido.");
            }
      scnInput.close();      
    
    
    }        
}
