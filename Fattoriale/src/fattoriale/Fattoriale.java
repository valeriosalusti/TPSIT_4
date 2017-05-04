package fattoriale;
public class Fattoriale 
{
 public static void main(String[] args) throws InterruptedException 
  {
   for(int cont=0;cont<10;cont++)
   {
    Stampa f=new Stampa(cont);
    f.start();  
    f.join(5);
   }    
 }
} 
 

