package array;

public class ArrayCompact {

    public static void main(String [] args){
        int [] a = new int[]{18,62,68,82,65,9};
        int [] b = new int[]{1,2,3,4,5};

        System.arraycopy(a,2,b,1,2);

        for (Integer integer:b){
            System.out.print(integer+" ");
        }
    }

}
