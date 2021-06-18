package thread;

import javax.swing.JOptionPane;

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

        /** Startando as thread criadas **/

        Thread thread = new Thread(THREAD_VETOR);
        Thread threadNotaFiscal = new Thread(THREAD_NOTA_FISCAL);
        Thread threadCalculate = new Thread(THREAD_CALCULATE);

        thread.start();
        threadNotaFiscal.start();
        threadCalculate.start();

        /**
         * Apredendo Thread rodando pro trás dos panos.
         *
         * THREAD em 2 processamento paralelos **/

    }
    public static final Runnable THREAD_CALCULATE = new Runnable() {
        @Override
        public void run() {

            try {
                Thread.sleep(50000);
                int[] vetor = new int[2];

                for (int counter = 0; counter < vetor.length; counter++) {
                    String inputText = JOptionPane.showInputDialog("Coloque o " + (counter + 1)+ "º " + "número: ");

                    int conveterInput = Integer.parseInt(inputText);

                    JOptionPane.showMessageDialog(null, "O resultado é \n" + (conveterInput + conveterInput));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    };

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
            try {
                Thread.sleep(1000);
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


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}
