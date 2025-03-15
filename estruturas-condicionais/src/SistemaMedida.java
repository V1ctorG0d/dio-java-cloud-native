public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "l";

        String resultado = sigla == "P" ? "Pequeno" : sigla == "M" ? "Médio" : sigla == "G" ? "Grande" : "Pé grande do dhiabo";

        System.out.println(resultado);
    }
}
