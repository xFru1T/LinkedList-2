import java.util.*;
class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Print string: ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll("[а-яА-Яa-zA-Z0-9]+", "");
        for (char c : newStr.toCharArray()) {
            list.add(c);
        }
        System.out.println("Reversed char symbol: " + list.reversed());
    }
}