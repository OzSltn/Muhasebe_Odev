package web.test;

public class MetotClass extends Zamlar {
    public MetotClass() {
    }
    Muhasebe muhasebe=MuhasebeBuild.startMuhasebe().setName("ayse")
            .setId(1).setMaas(50000).setKidem("personel").build();
    @Override
    public double zam() {
        double yeniMaas= muhasebe.getMaas();
        yeniMaas*=1.3;
        System.out.println(yeniMaas);
        return yeniMaas;
    }

    @Override
    public double prim() {
        double primliMaas=muhasebe.getMaas();
        primliMaas*=3;
        System.out.println(primliMaas);
        return primliMaas;
    }
    @Override
    public String title() {
        String sonKidem="personel 2";
        System.out.println(sonKidem);
        return sonKidem;
    }
}
