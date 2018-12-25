import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IntArrayList<String> l = new IntArrayList<String>();
        l.add("42");
        l.add("fdgdg");
        l.add("победа");
        l.add("hello world");
        IntArrayList<String> l2 = new IntArrayList<>();
        for (int i = 0; i < 20; i++) {
            l2.add("" + i);
        }

        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}