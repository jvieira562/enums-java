public class TesteEnums {

    public static void main(String[] args) {


        Prioridade pAlta = Prioridade.ALTA;
        Prioridade pMedia = Prioridade.MEDIA;
        Prioridade pBaixa = Prioridade.BAIXA;

        System.out.println(pAlta.name() + " = " + pAlta.getValor());
        System.out.println(pMedia.name() + " = " + pMedia.getValor());
        System.out.println(pBaixa.name() + " = " + pBaixa.getValor());

        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();

        thread1.setPriority(Prioridade.BAIXA.getValor());
        thread2.setPriority(Prioridade.MEDIA.getValor());
        thread3.setPriority(Prioridade.ALTA.getValor());

        System.out.println("\nThread-1-Priority = " + thread1.getPriority());
        System.out.println("Thread-2-Priority = " + thread2.getPriority());
        System.out.println("Thread-3-Priority = " + thread3.getPriority());

        /*
         * Apenas para testar os valores dos enums
         *
         */


    }
}