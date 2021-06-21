package com.company;

public class Yazilimci extends Calisan {

    private String diller;

    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }

    public void formatAt(String isletimSistemi) {
        System.out.println(getAd() + " " + isletimSistemi + "ni yüklüyor...");
    }

    //üst sınıftaki bilgileri çektim(Calisan)
    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
}
