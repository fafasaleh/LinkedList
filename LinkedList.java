import java.util.Scanner;

public class LinkedList {

    Node head;


    static class Node {

        String data;
        Node next;


        Node(String d)
        {
            data = d;
            next = null;
        }

        public Node next() {
            return next;
        }
    }



    public static LinkedList insert(LinkedList list,
                                    String data)
    {

        Node new_node = new Node(data);
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }


        return list;
    }

    public static LinkedList edit(LinkedList list , String key) {

        Node edit = list.head, prev = null;

        if (edit != null && edit.data.equals(key) ) {
            list.head = new Node(edit.data);
            System.out.println(key + " found and edit ");
            return list;

        }


    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");


        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }

    public static LinkedList deleteByKey(LinkedList list,
                                         String key)
    {
        Node currNode = list.head, prev = null;

        if (currNode != null && currNode.data.equals(key) ) {
            list.head = currNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }


        while (currNode != null && !currNode.data.equals(key) ) {
            prev = currNode;
            currNode = currNode.next;
        }


        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }




        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }




    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();

       Scanner in = new Scanner(System.in);

        System.out.println("pleas enter five names :");
        list = insert(list, in.next());
        list = insert(list, in.next());
        list = insert(list, in.next());
        list = insert(list, in.next());
        list = insert(list, in.next());



        printList(list);

        System.out.print("pleas enter one name to delete it :");
        deleteByKey(list, in.next());


        printList(list);

        System.out.print("pleas enter one name to delete it :");
        deleteByKey(list, in.next());


        printList(list);

        System.out.print("pleas enter one name to delete it :");
        deleteByKey(list, in.next());


        printList(list);


        System.out.print("pleas enter one name to edit it :");
        edit(list,in.next());
    }
}
