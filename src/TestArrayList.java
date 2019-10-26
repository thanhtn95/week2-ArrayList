public class TestArrayList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0, 38);
        list.add(1, 6);
        list.add(1, 9);
        list.add(2, 17);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("Size: " + list.size());
        System.out.println("Remove:" + list.remove(1));
        System.out.println("Size: " + list.size());
        System.out.println(list.get(1));
        int tmp = list.clone(0);
        System.out.println("Clone: " + tmp);
        System.out.println(list.contains(99));
        System.out.println(list.contains(17));
        System.out.println(list.indexOf(38));
        System.out.println(list.indexOf(100000));
        System.out.println("Size: " + list.size());
        System.out.println(list.add(69));
        System.out.println("Size: " + list.size());
        System.out.println(list.get(list.size() - 1));
        list.clear();
        System.out.println("Size: " + list.size());
        System.out.println(list.get(0));

    }
}
