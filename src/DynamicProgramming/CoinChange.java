package DynamicProgramming;

public class CoinChange {

    public static void main(String [] args){

        int amount = 5;
        int [] coins ={1,2,5};

        System.out.println("Number of combinations of getting change for "+amount+" is:"+change(coins,amount));
    }


    public static int change(int [] coins,int amount){

        int [] combinations = new int [amount+1];
        combinations[0]=1;

        for (int coin: coins){
            for (int i=coin;i<amount+1;++i){
                if (i>=coin){
                    combinations[i]+=combinations[i-coin];
                }
            }
        }

        return combinations[amount];

    }



    public static void printAmount(int [] arr){
        for (int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
