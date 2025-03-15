public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";
        //ESTRUTURA PADRÃO DO SWITCH-CASE
        // switch (plano) {
        //     case "T":{
        //        System.out.println("Olá"); 
        //         break;
        //     }
        //     case "M":{
        //         System.out.println("Tudo bem"); 
        //          break;
        //      }
        //      case "B":{
        //         System.out.println("To sem ideia"); 
        //          break;
        //      }            
        //     default:
        //         System.out.println("Indefinido");
        //         break;
        // }

        //MELHOR CASO PARA UM USO DO SWITCH-CASE NO LUGAR DO IF-ELSE
        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube"); 
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");      
            }
            case "B":{
                System.out.println("100 minutos de ligação"); 
            }    
                
        }
    }
}
