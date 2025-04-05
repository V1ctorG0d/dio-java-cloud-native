import java.util.Scanner; //Importando a classe Scanner


public class Contador {
    public static void main(String[] args) {
        //Interação com o usuário para pegar os valores dos parâmetros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        //Tratamento
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //Disparando a execeção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            //Contagem das ocorrências
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
}
