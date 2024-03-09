class Manoj extends Thread {
    synchronized public void callManoj() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e1) {
                System.out.println(e1);
            }
            System.out.println(Thread.currentThread().getName() + " says Manooj tu fakt maza ahes");
        }
    }
}

class myThread extends Thread {
    Manoj g;

    myThread(Manoj g) {
        this.g = g;

    }

    public void run() {
        g.callManoj();
    }
}

class S2 {
    public static void main(String args[]) {
        Manoj M = new Manoj();

        myThread t1 = new myThread(M);
        myThread t2 = new myThread(M);
        myThread t3 = new myThread(M);
        myThread t4 = new myThread(M);

        t1.setName("Sakshi");
        t2.setName("Tanvi");
        t3.setName("pratiksha");
        t4.setName("Sneha");

        t3.start();
        t2.start();
        t1.start();
        t4.start();

    }
}