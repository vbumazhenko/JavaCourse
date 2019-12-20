public class Main {
    public static void main(String[] args) {
        int vasyaAge = 22;
        int katyaAge = 20;
        int mishaAge = 35;

        int min = -1;
        int middle = -1;
        int max = -1;

        min = vasyaAge;
        if (katyaAge < min) {
            min = katyaAge;
        }
        if (mishaAge < min) {
            min = mishaAge;
        }

        max = vasyaAge;
        if (katyaAge > max) {
            max = katyaAge;
        }
        if (mishaAge > max) {
            max = mishaAge;
        }

        if (vasyaAge > min && vasyaAge < max) {
            middle = vasyaAge;
        }
        else if (katyaAge > min && katyaAge < max) {
            middle = katyaAge;
        }
        else if (mishaAge > min && mishaAge < max) {
            middle = mishaAge;
        }
        else {
            middle = min; // В случае, когда среднего значения нет
        }

        System.out.println("min = " + min);
        System.out.println("middle = " + middle);
        System.out.println("max = " + max);
    }
}
