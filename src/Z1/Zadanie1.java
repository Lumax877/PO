package Z1;

public class Zadanie1 {
    public static void main(String[] args) {
        Integer[] t1 = {3,1,4,1,3};
        System.out.println(jestPalindromem(t1));

    }
    public static  <T extends Comparable<T>> boolean jestPalindromem(T[] tab){
        for(int i=0; i < tab.length; i++){
            if (tab[i].compareTo(tab[tab.length - 1 - i]) != 0){
                return false;
            }

        }
        return true;
    }
}
