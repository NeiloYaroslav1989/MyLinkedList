
public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1); //index = 0
        myLinkedList.add(2); //index = 1
        myLinkedList.add(3); //index = 2
        myLinkedList.add(4); //index = 3
        myLinkedList.add(5); //index = 4

        System.out.println("Size = " + myLinkedList.size());
        myLinkedList.remove(3);
        System.out.println(myLinkedList.get(2));
        System.out.println("Size = " + myLinkedList.size());

        System.out.println(myLinkedList.contains(0));

        myLinkedList.clear();
        System.out.println("Size = " + myLinkedList.size());





    }


}
