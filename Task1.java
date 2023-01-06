package JavaHomework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//  1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("hello", "my", "friend"));  // задаем список
        System.out.println(list);
        Collections.reverse(list); // переворачиваем список
        System.out.println(list);
    }
}
