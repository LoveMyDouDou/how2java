package com.how2java.pojo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {

    public static void main(String [] args){
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10;++i){
            numbers.add(i);
        }
        System.out.println(numbers);
//        Collections.reverse(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
//        Collections.swap(numbers,0,5);
//        System.out.println(numbers);
        Collections.rotate(numbers,2);
        System.out.println(numbers);
        List<Integer> synchronizedNumbers = (List<Integer>)Collections.synchronizedList(numbers);
    }

}
