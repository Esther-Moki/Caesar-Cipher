public class Caesar {

    Blueprint blueprint = new Blueprint();
    public  String encrypting(String pText, int Key) {
        pText = pText.toLowerCase();
        String cText = "";
        for (int i = 0; i < pText.length(); i++){

            int charIndex = blueprint.getAlphabet().indexOf(pText.charAt(i));
            int newIndex = (charIndex + Key) % 26;
            char cipherChar = blueprint.getAlphabet().charAt(newIndex);
            cText = cText + cipherChar;
        }

        return cText;
    }


    public String decrypting(String cText, int Key) {
        cText = cText.toLowerCase();
        String pText = "";
        for (int i = 0; i < cText.length(); i++){
            int charIndex = blueprint.getAlphabet().indexOf(cText.charAt(i));
            int newIndex = (charIndex - Key) % 26;
            if (newIndex < 0) {
                newIndex = blueprint.getAlphabet().length() + newIndex;

            }
            char plainChar = blueprint.getAlphabet().charAt(newIndex);
            pText = pText + plainChar;
        }
        return pText;
    }
}

