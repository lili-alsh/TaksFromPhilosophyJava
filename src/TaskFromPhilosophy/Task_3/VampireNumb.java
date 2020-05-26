package TaskFromPhilosophy.Task_3;

import java.util.Arrays;
import java.util.HashSet;

public class VampireNumb {
    public static void main(String[] args) {
        vampireNumb();
    }

    static void vampireNumb () {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 11; i <100 ; i++) {
            for (int j =11; j <100 ; j++) {
                int res=i*j;
                if (!set.contains(res)) {
                    char [] numbers = (String.valueOf(i)+String.valueOf(j)).toCharArray();
                    char [] result=String.valueOf(res).toCharArray();
                    Arrays.sort(numbers);
                    Arrays.sort(result);
                    if (Arrays.equals(numbers,result)) {
                        set.add(res);
                        System.out.println("Число "+res+" ="+i+" * "+j);
                    }
                }
            }
        }
    }
}
