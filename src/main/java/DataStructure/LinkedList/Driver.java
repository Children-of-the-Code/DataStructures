package DataStructure.LinkedList;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TedsLinkedList list = new TedsLinkedList();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("AddToFront")){
//               assume that the user will send in a double
                input = scanner.nextLine();
                double parsedDouble = Double.parseDouble(input);
                list.addAtFront(parsedDouble);
                System.out.println(list);
            }else if(input.equals("AddToEnd")){
                input = scanner.nextLine();
                double parsedDouble = Double.parseDouble(input);
                list.addAtEnd(parsedDouble);
                System.out.println(list);
            }else if(input.equals("AddInOrder")){
                input = scanner.nextLine();
                double parsedDouble = Double.parseDouble(input);
                list.addInOrder(parsedDouble);
                System.out.println(list);
            }
            else if(input.equals("GetIndex")){
                input = scanner.nextLine();
                int parsedInt = Integer.parseInt(input);
                System.out.println(list.get(parsedInt));
            }
        }
    }
}
