package Zad002;

/**
 * Created by Michal Ziolecki.
 */
public class Zad7 {
   public String checkSumInTable(int[] array)
   {
       Integer sumOnPosMod2 = 0;
       Integer sumOnPosNotMod2 = 0;
       for(int i = 0; i < array.length; i++)
       {
           if(i%2 == 0) sumOnPosMod2 += array[i];
           else sumOnPosNotMod2 += array[i];
       }

       System.out.println("Sum on pos mod2: " + sumOnPosMod2);
       System.out.println("Sum on pos not mod2: " + sumOnPosNotMod2);
       String info;
       if(sumOnPosMod2 > sumOnPosNotMod2) return info  = "Parzyste komorki sa wieksze";
       else return info = "Nieparzyste komorki sa wieksze";
   }
}
