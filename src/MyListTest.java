public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(8);
        listInteger.add(4);

        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 3: "+listInteger.get(3));

        /*istInteger.get(6);
        System.out.println("element 6: "+ listInteger.get(6));*/

        listInteger.get(-1);
        System.out.println("element 1:"+ listInteger.get(-1));
    }
}
