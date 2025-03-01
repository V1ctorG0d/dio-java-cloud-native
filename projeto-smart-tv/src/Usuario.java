public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTV = new SmartTv();

        System.out.println("TV Ligada? : " + smartTV.Ligada);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);
        
        //Chamando o Método e imprimindo
        smartTV.Ligar();
        System.out.println("Estado da Atual --> TV Ligada? : " + smartTV.Ligada);

        smartTV.Desligar();
        System.out.println("Estado da Atual --> TV Ligada? : " + smartTV.Ligada);

        smartTV.Ligar();
        System.out.println("Estado da Atual --> TV Ligada? : " + smartTV.Ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Estado Atual --> Volume Atual : " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Estado Atual --> Volume Atual : " + smartTV.volume);

        smartTV.mudarCanal(25);
        System.out.println("Estado Atual --> Canal Atual : " + smartTV.canal);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println("Estado Atual --> Canal Atual : " + smartTV.canal);

        smartTV.diminuirCanal();
        System.out.println("Estado Atual --> Canal Atual : " + smartTV.canal);

        smartTV.Desligar();
        System.out.println("Estado da Atual --> TV Ligada? : " + smartTV.Ligada);
        
    }
}
