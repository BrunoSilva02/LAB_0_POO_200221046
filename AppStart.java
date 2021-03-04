import java.util.*;
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart{
    
    private static Size size;
    private static boolean loop = true;
    
    public static void main (String[] args){
   
     do{
         
         System.out.println("\n");
         System.out.println("1: Pequeno");
         System.out.println("2: Médio");
         System.out.println("3: Grande");
         
         Scanner input = new Scanner(System.in);
         int SeeSize = input.nextInt();
       switch(SeeSize){   
           
          case 1:
        
          Size size = Size.SMALL;
          print(size,SeeSize);
          loop = true;
          break;
        
          case 2:
        
          Size size2 = Size.MEDIUM;
          print(size2,SeeSize);
          loop = true;
          break;
        
          case 3:
          
          Size size3 = Size.LARGE;
          print(size3,SeeSize);
          loop = true;
          break;
          
          default: System.out.println("Essa opção é inválida");
                   loop = true;
                   break;
        
       }
       
     }while(loop == true);
     
  }
  
  private static void print(Size setSize, int input){
      
        size = setSize;
        System.out.println("Name         : "  +  size.name());
        System.out.println("toString()   : "  +  size.toString());
        System.out.println("Ordem        : "  +  input);
        System.out.println("Valor minímo : "  +  size.getMinValue());
        System.out.println("Valor máximo : "  +  size.getMaxValue());
        System.out.println("Código       : "  +  size.getCode());
        
  }
}
  
