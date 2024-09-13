package web.test;

public class MuhasebeBuild {

    private String name;
    private int id;
    private double maas;
    private String kidem;
    public MuhasebeBuild(){
    }

    public MuhasebeBuild(String name, int id, double maas, String kidem) {
        this.name = name;
        this.id = id;
        this.maas = maas;
        this.kidem=kidem;
    }

    public static MuhasebeBuild startMuhasebe(){
        return new MuhasebeBuild();
    }

    public Muhasebe build(){
        Muhasebe muhasebe=new Muhasebe();
        muhasebe.setName(name);
        muhasebe.setId(id);
        muhasebe.setMaas(maas);
        muhasebe.setKidem(kidem);
        return muhasebe;
    }

    public MuhasebeBuild setName(String name) {
        this.name = name;
        return this;
    }

    public MuhasebeBuild setId(int id) {
        this.id = id;
        return this;
    }

    public MuhasebeBuild setMaas(double maas) {
        this.maas = maas;
        return this;
    }

    public MuhasebeBuild setKidem(String kidem) {
        this.kidem = kidem;
        return this;
    }
}
