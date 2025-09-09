/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1denycandrakasuma024;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Reservasi {
        String namapemesan;
        String tanggal;
        String jam;
        String lapangan;

        Reservasi(String namaPemesan, String tanggal, String jam, String lapangan) {
            this.namapemesan = namaPemesan;
            this.tanggal = tanggal;
            this.jam = jam;
            this.lapangan = lapangan;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
            
            int pilihan;
            do {
                System.out.println("\n=== Sistem Manajemen Reservasi Lapangan Mini Soccer ===");
                System.out.println("1. Tambah Reservasi");
                System.out.println("2. Lihat Semua Reservasi");
                System.out.println("3. Ubah Reservasi");
                System.out.println("4. Hapus Reservasi");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine(); // buang newline
                
                switch (pilihan) {
                    case 1 -> {
                        // TAMBAH
                        System.out.print("Nama Pemesan : ");
                        String nama = sc.nextLine();
                        System.out.print("Tanggal (dd-mm-yyyy): ");
                        String tanggal = sc.nextLine();
                        System.out.print("Jam (HH:MM): ");
                        String jam = sc.nextLine();
                        System.out.print("Lapangan : ");
                        String lapangan = sc.nextLine();
                        
                        daftarReservasi.add(new Reservasi(nama, tanggal, jam, lapangan));
                        System.out.println("Reservasi berhasil ditambahkan!");
                    }
                        
                    case 2 -> {
                        // LIHAT
                        if (daftarReservasi.isEmpty()) {
                            System.out.println("Belum ada data reservasi.");
                        } else {
                            System.out.println("\n--- Daftar Reservasi ---");
                            for (int i = 0; i < daftarReservasi.size(); i++) {
                                Reservasi r = daftarReservasi.get(i);
                                System.out.println((i + 1) + ". " + r.namapemesan + " | " + r.tanggal + " | " + r.jam + " | Lapangan: " + r.lapangan);
                            }
                        }
                    }
                        
                    case 3 -> {
                        // UPDATE
                        if (daftarReservasi.isEmpty()) {
                            System.out.println("Belum ada reservasi yang bisa diubah.");
                        } else {
                            System.out.print("Masukkan nomor reservasi yang ingin diubah: ");
                            int idxUbah = sc.nextInt() - 1;
                            sc.nextLine();
                            if (idxUbah >= 0 && idxUbah < daftarReservasi.size()) {
                                Reservasi r = daftarReservasi.get(idxUbah);
                                
                                System.out.print("Nama Pemesan baru (kosongkan jika tidak diubah): ");
                                String newNama = sc.nextLine();
                                if (!newNama.isEmpty()) r.namapemesan = newNama;
                                
                                System.out.print("Tanggal baru (kosongkan jika tidak diubah): ");
                                String newTanggal = sc.nextLine();
                                if (!newTanggal.isEmpty()) r.tanggal = newTanggal;
                                
                                System.out.print("Jam baru (kosongkan jika tidak diubah): ");
                                String newJam = sc.nextLine();
                                if (!newJam.isEmpty()) r.jam = newJam;
                                
                                System.out.print("Lapangan baru (kosongkan jika tidak diubah): ");
                                String newLapangan = sc.nextLine();
                                if (!newLapangan.isEmpty()) r.lapangan = newLapangan;
                                
                                System.out.println("Reservasi berhasil diperbarui!");
                            } else {
                                System.out.println("Nomor reservasi tidak valid.");
                            }
                        }
                    }
                        
                    case 4 -> {
                        // HAPUS
                        if (daftarReservasi.isEmpty()) {
                            System.out.println("Belum ada reservasi yang bisa dihapus.");
                        } else {
                            System.out.print("Masukkan nomor reservasi yang ingin dihapus: ");
                            int idxHapus = sc.nextInt() - 1;
                            sc.nextLine();
                            if (idxHapus >= 0 && idxHapus < daftarReservasi.size()) {
                                daftarReservasi.remove(idxHapus);
                                System.out.println("Reservasi berhasil dihapus!");
                            } else {
                                System.out.println("Nomor reservasi tidak valid.");
                            }
                        }
                    }
                        
                    case 5 -> // KELUAR
                        System.out.println("Terima kasih! Telah Menggunakan Program.");
                        
                    default -> System.out.println("Pilihan tidak valid!");
                }
                
            } while (pilihan != 5);
        }
    }
}

// Deny Candra Kasuma
// 2409116024
// Sistem Informasi A