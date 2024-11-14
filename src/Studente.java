public class Studente {
    String nome;
    String cognome;
    double[] listaVoti = new double[5];

    public Studente(String nome, String cognome, double[] listaVoti){
        this.nome = nome;
        this.cognome = cognome;
        this.listaVoti = listaVoti;
    }

    public void stampaDati(){
        System.out.println("NOME: "+ this.nome+"\nCOGNOME: "+this.cognome +"\nMEDIA: " + this.getMedia(this.listaVoti)
        + "\nVOTI: ");
        for(int i = 0; i<this.listaVoti.length; i++){
            System.out.println(listaVoti[i]);
        }
    }

    public double getMedia (double[] param){
        double votiSomm = 0;
        for(int i = 0; i < param.length; i++){
            votiSomm+= param[i];
        }
        double media = votiSomm / param.length;

        return media;
    }
}
