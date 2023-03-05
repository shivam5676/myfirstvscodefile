import java.util.HashSet;
import java.util.Iterator;

class hashtest {
    public static void main(String args[]) {

        HashSet<Integer> set = new HashSet<>();
        // System.out.println(set);

        // set.add("Shivam");
        // set.add("shiv");
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        int a[] = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int k = 0, index = -1;
        while (it.hasNext()) {

            // System.out.println(it.next());
            a[k] = it.next();

            if (a[k] == 2) {
                index = k;
            }
            k = k + 1;

        }
        System.out.println(index);
        for (k = 0; k < a.length; k++) {
            System.out.print(a[k]);
        }

    }
}