package com.atb.interview;

public class PassByValue {

    public static void main(String[] args) {
        PassByValue pbv = new PassByValue();

        int[] numbers = pbv.setup();
        pbv.modify(numbers);
        pbv.printNumbers(numbers);

        numbers = pbv.setup();
        pbv.modify2(numbers);
        pbv.printNumbers(numbers);
    }

    private void modify(int[] values) {
        values[0] = 9;
    }

    private void modify2(int[] values) {
        int[] newValues = {9, 9, 9, 9};
        values = newValues;
    }

    private void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private int[] setup() {
        return new int[] {1, 2, 3, 4};
    }
}
