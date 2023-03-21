public class MyListTest {
    public static void main(String[] args) {
MyList<String> list = new MyList<String>();
list.add("Ha Noi");
list.add("Da Nang");
list.add("Nghe An");
list.add("Thanh Hoa");
list.add("Hai Phong");
list.addIndex(2,"Ha Tinh");
list.remove(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
    }
}
