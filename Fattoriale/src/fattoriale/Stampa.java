package fattoriale;
public class Stampa extends Thread
{
 int n;
 public Stampa(int num)
 {        
  this.n=num;
 }
 public void run()
 {
  int ris=this.n;
  for(int cont=1;cont<n;cont++)
  {
   ris=ris*(cont);
  }  
  System.out.println("-"+ris);
 }
}