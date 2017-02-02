package finestre_1;
import java.util.Scanner;
public class Finestre_1 {
    public static void main(String[] args) 
    {
     int cont;
     int risp,posizione=0;
     finestra f;
     do
     {
     System.out.println("Inserisci il numero di finestre da visualizzare");
     Scanner input=new Scanner(System.in);
     risp=input.nextInt();
     }while((risp<0)||(risp>15));
     for(cont=0;cont<risp;cont++)
     {    
      f=new finestra();
      f.setVisible(true);
      f.testo.setText("Sono la finestra 1"+(cont+1));
      f.setLocation(posizione,280);
      posizione=posizione+120;
      f.setTitle("Finestre");
     }
    }
}
