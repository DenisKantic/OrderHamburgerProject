package HamburgerPaket;

import java.util.Scanner;

public class Hamburger {


    private String imeHamburgera;
    private String vrstaMesa;
    private String tipHljeba;
    private double cijena;

    String Dodatak1;
    double dodatakcijena1;

    String Dodatak2;
    double dodatakcijena2;

    String Dodatak3;
    double dodatakcijena3;

    String Dodatak4;
    double dodatakcijena4;


    public Hamburger() {
    }

    public Hamburger(String imeHamburgera, String vrstaMesa, String tipHljeba, double cijena) {
        this.imeHamburgera = imeHamburgera;
        this.vrstaMesa = vrstaMesa;
        this.tipHljeba = tipHljeba;
        this.cijena = cijena;
    }

    public int odabirHamburgera() {

        int odabir;

        System.out.println("Izaberite vas hamburger: ");
        System.out.println(" 1. Classic hamburger" +
                "\n2. Healty hamburger" +
                "\n3. Deluxe hamburger");

        Scanner s = new Scanner(System.in);
        odabir = s.nextInt();


        switch (odabir) {

            case 1:

                int odabirDodatka;
                System.out.println("Izabrali ste \"Classic\" hamburger");

                System.out.println("Da li zelite dodatak u svoj hamburger?" +
                        "\n1. Zelim" +
                        "\n2. Ne zelim");

                Scanner input1 = new Scanner(System.in);
                odabirDodatka = s.nextInt();

                if (odabirDodatka == 1) {

                    int izabirDodatka;

                    String[] dodaci = {"", "Paradajz", "Kiseli krastavci", "Kecap", "Majoneza"};
                    double[] cijenaDodataka = {0.0, 0.75, 0.63, 0.35, 0.42};

                    System.out.println("Izaberite vas dodatak: " +
                            "\n1. Paradajz" +
                            "\n2. Kiseli krastavci" +
                            "\n3. Kecap" +
                            "\n4. Majoneza " +
                            "\n Za izlaz pritisnite \"5\" ");
                    Scanner input2 = new Scanner(System.in);
                    izabirDodatka = s.nextInt();


                        for (int i = 1; i <= dodaci.length; i++) {
                            for (int j = 1; j <= cijenaDodataka.length; j++) {

                                if (izabirDodatka == i) {

                                    System.out.println("Izabrali ste dodatak: " + dodaci[i] + " po cijeni " + cijenaDodataka[i]);
                                    break;
                                }

                            }
                        }
                    }
                    break;
                }


        return odabir;
    }

/*
    public void setDodatak1(String ime, double cijena) {

        this.Dodatak1 = ime;
        this.dodatakcijena1 = cijena;

    }

    public void setDodatak2(String ime, double cijena) {

        this.Dodatak2 = ime;
        this.dodatakcijena2 = cijena;

    }

    public void setDodatak3(String ime, double cijena) {

        this.Dodatak3 = ime;
        this.dodatakcijena3 = cijena;

    }

    public void setDodatak4(String ime, double cijena) {

        this.Dodatak4 = ime;
        this.dodatakcijena4 = cijena;

    }

    */

    public double statusHamburgera() {

        double cijenaHamburgera = this.cijena;

        System.out.println(this.imeHamburgera + " hamburger " + "na " + this.tipHljeba + " sa " + this.vrstaMesa + " iznosi " + this.cijena);

        if (Dodatak1 != null) {

            cijenaHamburgera += this.dodatakcijena1;
            System.out.println("Dodali ste " + this.Dodatak1 + " uz dodatno placanje od " + this.dodatakcijena1);
        }

        if (Dodatak2 != null) {

            cijenaHamburgera += this.dodatakcijena1;
            System.out.println("Dodali ste " + this.Dodatak1 + " uz dodatno placanje od " + this.dodatakcijena1);

        }

        if (Dodatak3 != null) {

            cijenaHamburgera += this.dodatakcijena1;
            System.out.println("Dodali ste " + this.Dodatak1 + " uz dodatno placanje od " + this.dodatakcijena1);

        }

        if (Dodatak4 != null) {

            cijenaHamburgera += this.dodatakcijena1;
            System.out.println("Dodali ste " + this.Dodatak1 + " uz dodatno placanje od " + this.dodatakcijena1);

        }

        return cijenaHamburgera;
    }
}
