package AdvanceJavaConcepts.Annotations;

import java.util.ArrayList;

public class Ex2 {

    @SuppressWarnings("unchecked")
    public static void main(String[]args){

        ArrayList list = new ArrayList();
        list.add("Hello");
        System.out.println(list);
    }
}
