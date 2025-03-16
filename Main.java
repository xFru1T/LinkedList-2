import java.util.*;
class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Print string: ");
        String str = scanner.nextLine();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        System.out.println("Reversed symbol: " + list.reversed());
    }
}