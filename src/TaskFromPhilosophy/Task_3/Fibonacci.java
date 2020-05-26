package TaskFromPhilosophy.Task_3;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci(5);
    }
        static void Fibonacci (int count) {
        int firstNumb=1, secNumb=0, numb=1;
        for (int i = 0; i <count ; i++) {
            if (i==0) {
                System.out.print(firstNumb+ ", ");
            } else {
                secNumb+=numb;
                numb=firstNumb;
                firstNumb=secNumb;
                if (i==count-1) {
                    System.out.print(secNumb);
                } else System.out.print(secNumb+ ", ");
            }
        }
    }
}
