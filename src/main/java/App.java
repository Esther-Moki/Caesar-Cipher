import java.util.Scanner;


    public class App {
        Caesar caesar = new Caesar();

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your text here");
            String plain = scan.nextLine();

            System.out.println("Enter the key");
            int Key = scan.nextInt();

            String cipherText = caesar.encrypting(plain, Key);
            System.out.println("The Cipher text:" + cipherText);

            System.out.println("The decoded message is:" + caesar.decrypting(cipherText, Key));
        }



    }






