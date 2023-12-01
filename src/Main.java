public class Main {

    public static void main(String[] args) {
        int[] Tablica = {1, 2, 3, 4, 5};
        System.out.println("Oryginalna tablica:");
        wypiszTablice(Tablica);

        odwrocTablice(Tablica);
        System.out.println("Odwrocona tablica:");
        wypiszTablice(Tablica);
    }

    public static void odwrocTablice(int[] tablica) {
        int dlugosc = tablica.length;
        for (int i = 0; i < dlugosc / 2; i++) {
            int temp = tablica[i];
            tablica[i] = tablica[dlugosc - 1 - i];
            tablica[dlugosc - 1 - i] = temp;
        }
    }

    public static void wypiszTablice(int[] tablica) {
        for (int element : tablica) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}