
public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1); //index = 0
        myLinkedList.add(2); //index = 1
        myLinkedList.add(3); //index = 2
        myLinkedList.add(4); //index = 3
        myLinkedList.add(5); //index = 4

        System.out.println("Size = " + myLinkedList.size());
        System.out.println("get: " + myLinkedList.get(3));


        System.out.println("getDuplex: " + myLinkedList.getDuplexSearch(3));
        System.out.println(myLinkedList.contains(0));

        myLinkedList.remove(3);
        System.out.println("Size = " + myLinkedList.size());

        myLinkedList.clear();
        System.out.println("Size = " + myLinkedList.size());





    }


}
