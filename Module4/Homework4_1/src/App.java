public class App {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMTOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++) {
            char ch = alphabet.charAt(i);
            System.out.println(ch + " - " + (int) ch);
        }
    }
}
