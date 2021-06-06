package com.company;

public class Main {

//    public static void minCost(String s, int[] cost) {
//
//        char character[] = s.toCharArray();
//        int size = character.length;
//        for(int i = 0; i < size - 1; i++)
//        {
//            int len = size;
//            for(int j = i; j < len - 1; j++)
//            {
//                char temp;
//                int value;
//                if(character[i] == (character[j + 1]))
//                {
//                    temp = character[i];
//                    character[i] = character[j + 1];
//                    character[j + 1] = temp;
//
//                    value = cost[i];
//                    cost[i] = cost[j + 1];
//                    cost[j + 1] = value;
//                    System.out.println("yes");
//                }
//            }
//        }
//        for(int i = 0; i < size; i++)
//        {
//            System.out.println(character[i] + " " + cost[i]);
//        }
//    }

    public static void main(String[] args) {
        String s = "abaac";
        char[] c = s.toCharArray();
        int size = s.length();
        int a = size;
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = i; j < a; j++)
            {
                if(c[i] == c[j + 1])
                {
                    System.out.println(i + " " + j);
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
            a--;
        }
        for(int i = 0; i < size; i++)
        {
            System.out.println(c[i]);
        }
//        int[] cost = {1,2,3,4,5};
//        minCost(s, cost);
    }
}
