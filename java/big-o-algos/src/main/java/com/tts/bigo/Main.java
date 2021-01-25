package com.tts.bigo;

public class Main {

    // O(1) - constant time
    // this operation will not scale or be affected by its input
    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    // O(n) - linear time
    // keep in mind that you are worried about the worst case scenario
    // O(5) -> O(n)
    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }

    // O(n^2) - quadratic time
    public static void printAllPossibleOrderedPairs(int[] items) {
        for (int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }

    // O(2n) -> 0(n)
    public static void printAllItemsTwice(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
        for (int item : items) {
            System.out.println(item);
        }
    }

    // keep in mind that n can be the actual value of an input as well
    // this can also be described as O(n)
    public static void sayHelloNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
    }

    // what is the big O of the function below?
    // O(1+2n) -> O(n)
    // keep in mind that algos can be described in many ways
    // if its useful to describe the amount of times hi is printed, then you may want to preserve that constant
    public static void  printFirstItemThenFirstHalfThenSayHi100Times(int[] items) {

        // O(1)
        System.out.println(items[0]);

        int middleIndex = items.length / 2;
        int index = 0;

        // 0(n)
        while (index < middleIndex) {
            System.out.println(items[index]);
            index++;
        }

        // O(n)
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi!");
        }
    }

    // O(n+n^2) -> 0(n^2)
    // the worst case is the nested for loop towards the bottom
    public static void printAllNumbersThenAllPairSums(int[] items) {

        // O(n)
        System.out.println("these are the numbers: ");
        for (int number : items) {
            System.out.println(number);
        }

        // O(n^2)
        System.out.println("and these are their sums: ");
        for (int firstNumber : items) {
            for (int secondNumber : items) {
                System.out.println(firstNumber + secondNumber);
            }
        }
    }

    // bear in mind that big O notation is not always black and white
    // below we can describe this algo as O(n) or O(1)
    // there may be a edge case where either notation is useful
    public static boolean contains(int[] haystack, int needle) {

        // O(n)
        for (int n : haystack) {
            if (n == needle) {
                return true;
            }
        }

        // O(1)
        return false;

    }

    // O(log n)
    public static void logTime(int n) {
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("this algorithm is logarithmic! Here's a number: " + i);
        }
    }

    public static void linearTime(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println("this algorithm is linear! Here's a number: " + i);
        }
    }

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4 ,5};

        printFirstItem(myArray);
        printAllItems(myArray);
        printAllPossibleOrderedPairs(myArray);
        logTime(1_000_000);
        linearTime(1_000_000);



    }

}
