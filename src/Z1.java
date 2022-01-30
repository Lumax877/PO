import java.math.BigInteger;

public class Z1 {
    public static void main(String[] args){
        BigInteger[] t1 = {BigInteger.valueOf(5),BigInteger.valueOf(7),BigInteger.valueOf(88),BigInteger.valueOf(90),BigInteger.valueOf(101)};
        System.out.println(isSorted(t1));
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] tab){

        for (int i = 0; i < tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) > 0)
                return false;
        }
        return true;
    }
}
