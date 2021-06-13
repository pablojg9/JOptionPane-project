package com.projeto.executaveis;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String text = "Pablo Junior, programador JAVA";

        String[] valueArray = text.split(",");

        //Convertendo Array para ArrayList
        List<String> list = Arrays.asList(valueArray);

       for(String value : list) {
           System.out.println(value);
       }

        //Covertendo ArrayList para Array
       String[] coversionArray = list.toArray(new String[1]);
        System.out.println(coversionArray);





    }

}
