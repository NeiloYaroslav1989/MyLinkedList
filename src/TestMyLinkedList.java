
public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1); //index = 0
        System.out.println(myLinkedList.get(0));

        myLinkedList.add(2); //index = 1
        myLinkedList.add(3); //index = 2
        myLinkedList.add(4); //index = 3
        myLinkedList.add(5); //index = 4

        System.out.println("Size = " + myLinkedList.size());

        myLinkedList.set(3, 10);
        System.out.println(myLinkedList.get(4));

        myLinkedList.remove(0);
        System.out.println(myLinkedList.get(0));

        System.out.println("Size = " + myLinkedList.size());






    }


}
