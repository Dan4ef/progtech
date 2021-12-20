class main {
    public static void main(String[] args) {
        int[] a = new int[100];

        for (int i = 2; i < 100; i++)
            a[i] = i + a[i - 1];
        System.out.print(a);
    }
}