package pe_solns;
//Luc Bettaieb

public class Solution_1 {
    public static void main(String[] args){
        //Find the sum of all numbers below 1000 that are multiples of 3 or 5
        int sum = 0;

        for(int i = 1;  i < 1000; i++){
            if((i % 3 == 0) || (i % 5 == 0))
                sum += i;
        }
        System.out.println("The sum of the multiples of 3 and 5 below 1000 is: " + sum);
    }
}
