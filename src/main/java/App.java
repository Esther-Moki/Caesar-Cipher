import java.util.Scanner;


    public class App {

        static String alphabet = "abcdefghijklmnopqrstuvwxyz";

        public static String encrypting(String pText, int Key) {
            pText = pText.toLowerCase();
            String cText = "";
            for (int i = 0; i < pText.length(); i++){

                int charIndex = alphabet.indexOf(pText.charAt(i));
                int newIndex = (charIndex + Key) % 26;
                char cipherChar = alphabet.charAt(newIndex);
                cText = cText + cipherChar;
            }

            return cText;
        }


        public static String decrypting(String cText, int Key) {
            cText = cText.toLowerCase();
            String pText = "";
            for (int i = 0; i < cText.length(); i++){
                int charIndex = alphabet.indexOf(cText.charAt(i));
                int newIndex = (charIndex - Key) % 26;
                if (newIndex < 0) {
                    newIndex = alphabet.length() + newIndex;

                }
                char plainChar = alphabet.charAt(newIndex);
                pText = pText + plainChar;
            }
            return pText;
        }


        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your text here");
            String plain = scan.nextLine();

            System.out.println("Enter the key");
            int Key = scan.nextInt();

            String cipherText = encrypting(plain, Key);
            System.out.println("The Cipher text:" + cipherText);

            System.out.println("The decoded message is:" + decrypting(cipherText, Key));
        }



    }






