package com.atb.interview;

import java.util.ArrayList;
import java.util.List;

public class PassByValue2 {

    public static void main(String[] args) {
        PassByValue2 pbv = new PassByValue2();

        List<Integer> numbers = pbv.setup();
        pbv.modify(numbers);
        pbv.printNumbers(numbers);

        numbers = pbv.setup();
        pbv.modify2(numbers);
        pbv.printNumbers(numbers);
    }

    private void modify(List<Integer> values) {
        values.set(0, 9);
    }

    private void modify2(List<Integer> values) {
        ArrayList<Integer> newValues = new ArrayList();
        newValues.add(9);
        newValues.add(9);
        newValues.add(9);
        newValues.add(9);
        values = newValues;
    }

    private void printNumbers(List<Integer> numbers) {
        for (Integer number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private List<Integer> setup() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return list;
    }
}
