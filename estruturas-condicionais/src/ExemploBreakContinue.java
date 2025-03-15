public class ExemploBreakContinue {
    public static void main(String[] args) {
        //Caso tenha um passo que queira desconsiderar na aplicação usar o continue
        for (int i = 0; i < 5; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
