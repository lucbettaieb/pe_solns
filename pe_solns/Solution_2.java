package pe_solns;
//Luc Bettaieb

public class Solution_2 {
    private static final int LIMIT = 4000000;
    private static final int FIB_1 = 1;
    private static final int FIB_2 = 2;

    public static void main(String[] args){
        //Find the sum of all even fibbonaci numbers under 4 million
        //Fibbonaci is 0, 1, 1, 2, 3, 5, 8, 13, 21...

        int sum = 0;
        int fib;

        for(int i = 0; i <= getNumFibsUnder(LIMIT); i++){
            fib = getFib(i);
            if((fib%2) == 0)
               sum += fib;
        }
        System.out.println("Sum: " + sum);
    }

    private static int getFib(int at){
        int fib = 0;
        for(int tmp, cnt = 0, i = FIB_1, j = FIB_2; cnt < at; tmp = j, j = i + j, i = tmp, cnt++)
            fib = i;
        return fib;
    }

    private static int getNumFibsUnder(int under){
        int i = 0;
        while(getFib(i) < under)
            i++;
        return i-1;
    }
}