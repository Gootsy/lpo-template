public class Frite {
    public static void main(String[] args) {
        final int frite = 350;
        final int sauce = 80;
        final int boisson = 250;
        int quantiteFrite = Integer.parseInt(IO.readln("Combien de frite?"));
        String commande = "2 frites, 3 sauces, 1 boisson";
        int commandFrite = quantiteFrite*frite;
        int commandeSauce = 3*sauce;
        int commandeBoisson = 1*boisson;
        int sousTotal = commandFrite + commandeSauce + commandeBoisson;
        int reduc = sousTotal-((sousTotal/100)*10);
        int paye = 2000;
        int monnaie = paye - sousTotal;
        int monnaieReduc = paye - reduc;
        int renduPiece = monnaie/200;
        int renduPieceReduc2 = monnaieReduc/200;
        int renduReste = monnaie%200;
        int renduResteReduc = monnaieReduc%200;
        int renduPieceReduc1 = renduResteReduc/100;
        String rendu = renduPiece +" pièces de 2€, reste "+ formatEuros(renduReste);
        String renduReduc = renduPieceReduc2 +" pièces de 2€, "+ renduPieceReduc1 +" pièces de 1€ et "+0+" pièce de 20c.";
        double tripleSauce = 3*0.8;

        System.out.println("Commande : "+commande);
        System.out.println("Sous-total : "+sousTotal+" centimes");
        System.out.println("Sous-total : "+formatEuros(sousTotal));
        System.out.println("Payé : "+formatEuros(paye));
        System.out.println("Monnaie : "+formatEuros(monnaie));
        System.out.println("Rendu : "+rendu);
        System.out.println("3 sauces en centimes : "+commandeSauce);
        System.out.println("3 sauces en euros : "+tripleSauce);
        System.out.println("Sous-total avec 10% : "+formatEuros(reduc));
        System.out.println("Monnaie : "+formatEuros(monnaieReduc));
        System.out.println("Rendu : "+renduReduc);

    }
    public static String formatEuros(int amountInCents){
        if ((amountInCents%100) < 10){
           return(amountInCents/100)+",0"+(amountInCents%100)+" €";
        }else{
            return (amountInCents/100)+","+(amountInCents%100)+" €";
        }
    }
}
