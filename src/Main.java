import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //esercizio1

     //   System.out.println("inserisci il primo numero intero");
     //   int number1 = sc.nextInt();
     //   System.out.println("inserisci il secondo numero intero");
      //  int number2 = sc.nextInt();
     //   System.out.println("inserisci il terzo numero intero");
     //   int number3 = sc.nextInt();
     //  if(number1 >= number2 && number1 >= number3){
     //       System.out.println("il numero più grande inserito è:" + number1);
     //   }else if(number2 >= number1 && number2 >= number3){
    //        System.out.println("il numero più grande inserito è:" + number2);
     //   }else {
      //      System.out.println("il numero più grande inserito è:" + number3);
      //  }

        //esercizio2

     //   System.out.println("inserisci il primo numero");
     //   double number4 = sc.nextDouble();
      //  System.out.println("inserisci il secondo numero");
        //double number5 = sc.nextDouble();
//        System.out.println("inserisci quale operazione matematica vuoi fare esempio + o -");
 //       String operazioneInput = sc.next();
   //     char operazione = operazioneInput.charAt(0);
     //   double risultato = 0;
       // switch (operazione) {
         //   case '+':
           //     risultato = number4 + number5;
             //   break;
           // case '-':
             //   risultato = number4 - number5;
//                break;
  //          case '*':
    //            risultato = number4 * number5;
      //          break;
        //    case '/':
          //      if (number5 != 0) {
            //        risultato = number4 / number5;
//                } else {
  //                  System.out.println("non posso dividere per 0");
      //              return;
    //            }
//                break;
  //          default:
    //            System.out.println("Operazione non valida.");
         //       return;
//        }
  //      System.out.println("Il risultato dell'operazione è: " + risultato);



        //esercizio 3
//        System.out.println("inserisci una serie di numeri interi e l' algoritmo rivelerà se sono pari o dispari, per uscire inserire il  numero 0");
  //      while(true ){
//            int number6 = sc.nextInt();
  //          if(number6 == 0){
    //            break;
      //      }else{
        //        if(number6 % 2 ==0){
          //          System.out.println(number6 +" è pari");
            //    }else{
              //      System.out.println(number6 +" è dispari");
//                }
  //          }
    //    }

        System.out.println("inserisci 10 numeri,e l algoritmo ti tornerà la media di essi, e il numero massimo inserito");
        double numbers[]= new double[10];
        for(int i = 0; i <10; i++){

            numbers[i] = sc.nextDouble();
        }

        double maxNumber = numbers[0];
        double count = 0;
        for(int i= 0; i < 10; i++ ){
            count += numbers[i];
            if(numbers[i] > maxNumber)maxNumber = numbers[i];
        }
        double media = count / 10;

        System.out.println("la media dei numeri inseriti è: " + media + " /ne il numero maggiore inserito è: " + maxNumber);


    }
}