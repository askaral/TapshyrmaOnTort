public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Askar","kyrgyz","SAP");
        System.out.println(programmer);
        System.out.println("~ * ~ * ~ * ~ * ~ * ~ * ~ * ~");
        Dancer dancer = new Dancer("Albina","kyrgyz","Agama");
        System.out.println(dancer);
        System.out.println("~ * ~ * ~ * ~ * ~ * ~ * ~ + ~");
        Singer singer = new Singer("Adele", "british","She is single singer");
        System.out.println(singer);
    }
}