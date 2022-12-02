package aa_takim_odevleri.hashSetToplam;

import java.util.HashSet;

public class HashSet01 {

    public static void main(String[] args) {

        HashSet<Double> sayilar = new HashSet<>();
        HashSet01 runner = new HashSet01();
        runner.setOlustur(sayilar);
        runner.toplaminiAl(sayilar);
    }

    public HashSet<Double> setOlustur(HashSet<Double> toplanacakSayilar){

        toplanacakSayilar.add(3.23);
        toplanacakSayilar.add(3.10);
        toplanacakSayilar.add(5.12);
        toplanacakSayilar.add(10.12);
        toplanacakSayilar.add(23.12);

        return toplanacakSayilar;
    }

    public void toplaminiAl(HashSet<Double> sayilar){
        double toplam = 0;
        for(Double w: sayilar){
            toplam += w;
        }
        System.out.println(toplam);
    }
}
