class primearray {
    public static void main(String args[]) {
        int n = 5;
        int a[] = new int[n];
        int num = 1, count = 0;
        while (count < n) {
            int d = 1, flag = 0;
            while (num >= d) {
                if (num % d == 0 && flag <= 2) {
                    d = d + 1;
                    continue;
                }
            }
            if (flag == 2) {
                a[count] = num;
            }
            num = num + 1;
        }
        System.out.println(a[0] + " " + a[1]);
    }
}