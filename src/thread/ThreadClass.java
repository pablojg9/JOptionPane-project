package thread;

public class ThreadClass {
    public static void main(String[] args) throws InterruptedException {




        for(int position = 0; position < 10; position++) {
            Thread.sleep(10000);

            System.out.println("Executando alguma rotina - envio de email");

        }

    }
}
