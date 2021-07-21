public class HipotenusaTest 
 {
     public double catetos(int cateto1, int cateto2) {
         double hipotenusa= 0;
         hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+
                 Math.pow(cateto2, 2));
                 
         return hipotenusa;

     }
}
