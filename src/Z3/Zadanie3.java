package Z3;

import java.io.File;
import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        String path = "src/Z1";
        String ext = ".txt";
        System.out.println(Arrays.toString(list(path,ext)));

    }
    public static String[] list(String path, String ext){
        File f = new File(path);
        return f.list((a,b) -> !b.endsWith(ext));
    }
}
