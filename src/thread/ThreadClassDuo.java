package thread;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ThreadClassDuo {

    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            @Override
            public void run() {
                for (int position = 0; position < 10; position++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Executando alguma rotina - envio de email");
                }
                super.run();
            }
        }.start();

        /** Instanciando a CLASSE Thread e chamando métodos staticos dentro de uma nova Thread **/
        Thread thread = new Thread(THREAD_VETOR);
        Thread threadNotaFiscal = new Thread(THREAD_NOTA_FISCAL);

        /** Startando as thread criadas **/
        thread.start();
        threadNotaFiscal.start();

        /**
         * Apredendo Thread rodando pro trás dos panos.
         *
         * THREAD em 2 processamento paralelos **/

    }

    /** EXECUTANDO A "NOTA FISCAL" EM UMA THREAD PARALELA **/
    private static final Runnable THREAD_NOTA_FISCAL = new Runnable() {
        @Override
        /** SOBREPONDO O MÉTODO RUN() **/
        public void run() {
            for(int position = 0; position < 10; position++) {
                /** TRATAMENTO DE RRO PARA USAR O MÉTODO STATIC SLEEP **/
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executando alguma rotina - envio de nota fiscal");
            }
        }
    };

    /** Usando esse THREAD COM VETOR OU ARRAY **/
    public static final Runnable THREAD_VETOR = new Runnable() {
        @Override
        public void run() {

            float[] posicaoArray = new float[10];

            for (int counter = 0; counter < posicaoArray.length; counter++) {
                String inputDialog = JOptionPane.showInputDialog("Coloque o " + (counter + 1) + " primeiro número: ");


                posicaoArray[counter] = Integer.parseInt(inputDialog);
            }

            /** Chamando a CLASS e instanciando o StringBuilder **/
            StringBuilder stringBuilder = new StringBuilder();


            /** Mostrando os número que o cliente colocou **/
            for (float posicaoArrayLoop : posicaoArray) {
                stringBuilder.append("número: " + posicaoArrayLoop + "\n");
            }
            JOptionPane.showMessageDialog(null, stringBuilder.toString());

        }
    };
}
