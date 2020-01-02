public class App {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        String[] newColors = new String[colors.length];
        for (int i = colors.length - 1; i >= 0; i--) {
            newColors[colors.length - i - 1] = colors[i];
        }
        for (String color : newColors) {
            System.out.println(color);
        }
    }
}
