package JavaHomework4;

import java.util.LinkedList;

//  3. В шаблоне MyQueue с урока реализовать методы
public class MyQueue {
    private static LinkedList<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        add("hello");
        add("my");
        add("friend");                //добавить в конец очереди
        System.out.println(queue);
        System.out.println(top());    //посмотреть первое в очереди
        System.out.println(remove()); //извлечь и вернуть первое в очереди
        System.out.println(remove());
        System.out.println(queue);
    }

    //добавить в конец очереди
    private static void add(String hello) {
        queue.add(hello);
        System.out.println("added: " + hello);
    }

    //посмотреть первое в очереди
    private static String top() {
        String topItem = queue.get(0);
        return "first element: " + topItem;
    }

    //извлечь и вернуть первое в очереди
    private static String remove() {
        String removeItem = queue.get(0);
        queue.remove(removeItem);
        return "deleted: " + removeItem;
    }
}
