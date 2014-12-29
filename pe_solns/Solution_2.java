package pe_solns;
//Luc Bettaieb

public class Solution_2 {
    public static void main(String[] args){
        //Find the sum of all even fibbonaci numbers under 4 million
        //Fibbonaci is 0, 1, 1, 2, 3, 5, 8, 13, 21...

        int sum = 0;
        int fib;

        for(int i = 0; i <= getNumFibsUnder(4000000); i++){
            fib = getFib(i);
            if((fib%2) == 0)
               sum += fib;
        }
        System.out.println("Sum: " + sum);
    }

    private static int getFib(int at){
        int fib = 0;
        for(int tmp = 0, cnt = 0, i = 1, j = 2; cnt < at; tmp = j, j = i + j, i = tmp, cnt++)
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