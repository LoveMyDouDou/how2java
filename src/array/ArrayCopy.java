package array;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String [] args){

        int [] a = new int [10];

        Arrays.fill(a,6);
        System.out.println(Arrays.toString(a));

//        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
//        int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
//        System.out.println(Arrays.equals(a, b));

//        int [] a = new int [] {18,62,68,82,65,9};
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println("数字62排序后的位置:"+Arrays.binarySearch(a,62));
//
//
//
//        System.out.println("排序之前");
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("排序之后");
//        System.out.println(Arrays.toString(a));
//
//
//        String content = Arrays.toString(a);
//        System.out.println(content);
//
//        int [] b = Arrays.copyOfRange(a,0,3);
//
//        for (Integer integer:b){
//            System.out.print(integer+" ");
//        }
    }
}
