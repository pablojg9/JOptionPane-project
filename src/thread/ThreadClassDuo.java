package thread;

import javax.swing.JOptionPane;

public class ThreadClassDuo {

    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            @Override
            public void run() {
                for(int position = 0; position < 10; position++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Executando alguma rotina - envio de email");
                }
                super.run();
            }
        }.start();


        System.out.println("O código chegou no fim");

        JOptionPane.showMessageDialog(null, "Sistema contino executando para o usuario");




    }

}
