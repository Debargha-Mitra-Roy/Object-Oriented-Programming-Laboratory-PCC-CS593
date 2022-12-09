import java.util.Scanner;

class MultiThread {

    public static Scanner sc = new Scanner(System.in);

    int counter = 1;

    static int n;

    public void printOddNumber() {
        synchronized (this) {

            while (counter < n) {

                while (counter % 2 == 0) {

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(counter + " ");

                counter++;

                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {

            while (counter < n) {

                while (counter % 2 == 1) {

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(counter + " ");

                counter++;

                notify();
            }
        }
    }

    public void printFibbonacciNumber() {
        synchronized (this) {

            int a = 0, b = 1, c = 0;

            while (c < n) {

                System.out.print(c + " ");

                a = b;
                b = c;
                c = a + b;
            }
        }
    }

    public void printPrimeNumber() {
        synchronized (this) {

            int i, j, flag = 0;

            for (i = 2; i <= n; i++) {

                for (j = 2; j <= i / 2; j++) {

                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0)
                    System.out.print(i + " ");

                flag = 0;
            }
        }
    }

    public static void main(String args[]) {

        n = sc.nextInt();

        MultiThread mt = new MultiThread();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                mt.printFibbonacciNumber();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            public void run() {
                mt.printPrimeNumber();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
