import java.util.Random;

public class ContoBancario {
    int numeroConto;
    double saldo;

    public ContoBancario(){
        numeroConto();
        this.saldo = 0;
    }

    public void numeroConto(){
        Random numRandom = new Random();
        int numeroCasuale = numRandom.nextInt(1000);
        this.numeroConto = numeroCasuale;
    }

    public void prelievo(double param){
        if(param > this.saldo){
            System.out.println("sei povero prima deposita qualcosa");
        }else{
            this.saldo -= param;
            System.out.println("prelievo effettuato con successo\nil tuo nuovo saldo è: " + this.saldo);
        }
    }

    public void deposita(double param){
        this.saldo += param;
        System.out.println("deposito effettuato con successo \nil tuo nuovo saldo è: "+ this.saldo);
    }

    public void stampaSaldo(){
        System.out.println("SALDO: "+ this.saldo);
    }

    public void stampaDettagli(){
        System.out.println("NR CONTO: "+ this.numeroConto+ "\nSALDO: " + this.saldo);
    }



}
