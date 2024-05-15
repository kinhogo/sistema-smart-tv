public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " +smartTv.volume);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual : " +smartTv.canal);




        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?: " +smartTv.canal);
        System.out.println("Volume Atual ?: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ?" + smartTv.ligada);


    }
}
