package be.ehb.demo_ti.model;

public class Student {

    private String voornaam, achternaam;
    private int studentenNummer;

    public Student() {
    }

    public Student(String voornaam, String achternaam, int studentenNummer) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.studentenNummer = studentenNummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getStudentenNummer() {
        return studentenNummer;
    }

    public void setStudentenNummer(int studentenNummer) {
        this.studentenNummer = studentenNummer;
    }
}
