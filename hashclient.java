package lec27;

public class hashclient {
    public static void main(String[] args) {
        HashmapLL map = new HashmapLL();

        map.put("Apple", "Bekar");
        map.put("orange", "bhaut bekaar");
        map.put("mango", "badhiya");

        System.out.println(map);
//        System.out.println();
//
//        System.out.println(map.get("orange"));
//        System.out.println();
//        System.out.println(map.remove("Apple"));
//        System.out.println();
//        map.put("banana", "bahut jada bekaar");
//        System.out.println(map);
    }
}
