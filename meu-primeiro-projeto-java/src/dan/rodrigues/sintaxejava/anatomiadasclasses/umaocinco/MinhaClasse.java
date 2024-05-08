package dan.rodrigues.sintaxejava.anatomiadasclasses.umaocinco;

public class MinhaClasse {
    
    public static void main (String [] args){
        String primeiroNome = "Dan";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
   
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
         return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);    
    }

    public static String testeString(String primeiroNome){
        if (primeiroNome = "Dan") {
           System.out.print("Você é udam!");
        }   else{
            System.out.print("Você não é udam!");
        }

    }

}
 