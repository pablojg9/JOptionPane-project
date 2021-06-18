package thread;

public class ThreadClass {
    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            @Override
            public void run() {
                for(int position = 0; position < 10; position++) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Executando alguma rotina - envio de email");

                }
                super.run();
            }
        }.start();




    }
}
