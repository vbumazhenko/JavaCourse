public class App {
    public static void main(String[] args) {

        float[] temperatures = new float[30];
        float sum = 0;
        int healthCount = 0;

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (float) (32 + Math.random() * 8);
            sum += temperatures[i];
            if (temperatures[i] >= 36.2 && temperatures[i] <= 36.9) {
                healthCount++;
            }
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();

        float avgTemp = sum / temperatures.length;
        System.out.println("Средняя температура: " + avgTemp);
        System.out.println("Количество здоровых пациентов: " + healthCount);
    }
}
