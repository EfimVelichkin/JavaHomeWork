package org.example;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createdList(n);
        System.out.println("linkedList = " + linkedList);
            for (int i = 0; i < linkedList.size() / 2; i++) {
                int temp = linkedList.get(i);
                linkedList.set(i,linkedList.get(linkedList.size() - 1 - i));
                linkedList.set(linkedList.size() - 1 - i, temp);
            }
            for (int num : linkedList) {
                System.out.print(num + " ");
            }
    }
    private static LinkedList<Integer> createdList(int n){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}