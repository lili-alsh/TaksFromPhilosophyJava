package TaskFromPhilosophy.Task_3;

public class SimpleNumb {
    public static void main(String[] args) {
        printNumb();
    }
        static void printNumb() {
        int [] mass=new int[19];
        int firstNumb=1;
        for (int i = 0; i <mass.length ; i++) {
            mass[i]=++firstNumb;
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j = i+1; j <mass.length ; j++) {
                if (mass [i]!=0 && mass[j] % mass[i]==0) {
                    mass[j]=0;
                }
            }
            if (mass [i]!=0) System.out.print(mass[i]+" ");
        }
    }
}
