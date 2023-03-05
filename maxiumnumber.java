class maxiumarray {
    int max = a[0];

    void maxi() {
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
            System.out.println(max);
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        maxiumarray m = new maxiumarray();
        m.maxi();
        // System.out.println(max);
    }
}