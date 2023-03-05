class alterbit {
    public static void main(String args[]) {
        int n = 1, c = 0;
        while (n > 0 && c == 0) {
            if (((n >> 0) & 1) != ((n >> 1) & 0)) {

                n = n >> 1;
                continue;
            }
            c = c + 1;
        }
        if (c == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
