package web.test;

public class Muhasebe {

    private String name;
    private int id;
    private double maas;
    private String kidem;

    public Muhasebe(){
    }

    public Muhasebe(String name, int id, double maas, String kidem) {
        this.name = name;
        this.id = id;
        this.maas = maas;
        this.kidem=kidem;
    }

    @Override
    public String toString() {
        return "Muhasebe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", maas=" + maas +
                ", kidem='" + kidem + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getKidem() {
        return kidem;
    }

    public void setKidem(String kidem) {
        this.kidem = kidem;
    }
}
