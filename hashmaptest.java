import java.util.*;

import javax.swing.ImageIcon;

class hashm {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap();
        String a[] = { "a", "b", "a" };
        System.out.println(map);
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else
                map.put(a[i], 1);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

}