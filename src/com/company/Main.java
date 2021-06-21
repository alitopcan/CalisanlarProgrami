package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz..");
        String islemler = "İşlemler...\n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici İşlemleri\n"
                + "Çıkış için q'ya basın";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");

        while (true) {
            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Ali", "Topcan", 123, "C#,Java");
                String yazilimciIslem = "Yazılımcı İşlemleri\n"
                        + "1. Format At\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basın";
                System.out.println(yazilimciIslem);

                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {

                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {

                        System.out.print("İşletim sistemi: ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);

                    } else if (y_islem.equals("2")) {

                        yazilimci.bilgileriGöster();
                    } else {
                        System.out.println("Geçersiz yazılımcı işlemi...");
                    }
                }

            } else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Veli", "Güçlü", 546, 10);
                String yoneticiIslem = "Yönetici İşlemleri\n"
                        + "1. Zam Yap\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basın";
                System.out.println(yoneticiIslem);

                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String yonetici_islem = scanner.nextLine();

                    if (yonetici_islem.equals("q")) {

                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;

                    } else if (yonetici_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else if (yonetici_islem.equals("2")) {
                       yonetici.bilgileriGöster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi...");
                    }
                }

            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
