import java.util.ArrayList;
import java.util.Scanner;

class Data {
    private ArrayList<Tanaman> tanamans = new ArrayList<>();
    private ArrayList<Integer> lokasi = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public void mulai() {
        System.out.print("Masukkan masa tanam (dalam bulan) : ");
        int bulan = in.nextInt();
        int hari = bulan * 30;

        for (int i = 0; i < 3; i++) {
            menanam();
        }

        for (int i = 0; i < hari; i++) {
            for (int j = 0; j < tanamans.size(); j++) {
                if (lokasi.contains(j)) continue;

                Tanaman t = tanamans.get(j);
                if (t.status().equals("Hidup")) {
                    t.berkembang();
                } else {
                    lokasi.add(j);
                    menanam();
                }
            }

            if ((i + 1) % 90 == 0) {
                for (int j = 0; j < tanamans.size(); j++) {
                    if (!lokasi.contains(j)) {
                        ((Perawatan) tanamans.get(j)).treatment();
                    }
                }
            }
        }
    }

    public void menanam() {
        System.out.println("Pilih tanaman yang ingin ditanam :");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = in.nextInt();

        Tanaman tanaman = null;
        switch (pilihan) {
            case 1 -> tanaman = new Tomat();
            case 2 -> tanaman = new Stroberi();
            case 3 -> tanaman = new Persik();
        }

        if (tanaman != null) {
            tanamans.add(tanaman);
            System.out.println("Berhasil menanam " + tanaman.getClass().getSimpleName());
        }
    }

    public void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman ke-" + (i + 1) + " : " + tanamans.get(i).toString());
        }
    }
}
