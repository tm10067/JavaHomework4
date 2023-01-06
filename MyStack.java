package JavaHomework4;

import java.util.LinkedList;
//  2. В шаблоне MyStack с урока реализовать методы
public class MyStack {
    private static LinkedList<String> stack = new LinkedList<>();
    public static void main(String[] args) {
        push("hello");
        push("my");
        push("friend");       //добавить в конец стека
        System.out.println(stack);
        System.out.println(peek()); //посмотреть последнее в стеке
        System.out.println(pop());  //посмотреть и извлечь последнее в стеке
        System.out.println(pop());
        System.out.println(stack);
    }

    //добавить в конец стека
    private static void push(String hello) {
        stack.add(hello);
        System.out.println("added: " + hello);
    }

    //посмотреть последнее в стеке
    private static String peek() {
        if (queue.isEmpty()){
            return "stack is empty";
        }
        String peekItem = stack.get(stack.size() - 1);
        return "last element: " + peekItem;
    }

    //посмотреть и извлечь последнее в стеке
    private static String pop() {
        if (queue.isEmpty()){
            return "stack is empty";
        }
        String popItem = stack.get(stack.size() - 1);
        stack.removeLast();
        return "deleted: " + popItem;
    }
}
