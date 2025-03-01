public class SmartTv {
    //Variaveis
    boolean Ligada = false;
    int canal = 1;
    int volume = 25;



    //Métodos
    public void Ligar(){
        Ligada = true;
    }

    public void Desligar(){
        Ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}