package ejerciciosHilos;

public class Cuenta extends Thread {

    private final int number;

    Cuenta(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.printf("%s: %d ^ %d = %.0f%n",getName(), number,i,(Math.pow(number, i)));

        }

    }


}