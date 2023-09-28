import java.security.SecureRandom;
import java.util.Random;
public class PasswordGenerator {

    public static void main (String []args){

        String password = geradorSenha(12);
        System.out.println(password);
    }
    public static String geradorSenha(int length){
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVXZWY";
        String lowercase = "abcdefghijklmnopqrstuvxwy";
        String digitos = "123456789";
        String symbol = "!@#$%¨&*()_+?:><.,{}[]";
        String caracteres = uppercase + lowercase + digitos + symbol;

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0;  i < length; i++){
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
            return sb.toString();
        }

}
