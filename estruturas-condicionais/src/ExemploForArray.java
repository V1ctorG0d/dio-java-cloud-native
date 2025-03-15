public class ExemploForArray {  
    public static void main(String[] args) {
        String alunos[] = {"Joao","cucamoto","kimjomhum"};
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }


        //Forma abreviada com for each
        for(String aluno : alunos){
            System.out.println("Alunos com FOR EACH "+ aluno);
        }
    }   
}