public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.7;
        double valorSolicitado = 15.5;

        if (valorSolicitado < saldo) 
            saldo = saldo - valorSolicitado;
            
        System.out.println(saldo);

    }
}
