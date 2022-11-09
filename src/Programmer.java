public class Programmer  extends Person{

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String coding(){
        return getName()+" can coding";
    }

    @Override
    public String toString() {
        return "Programmer: \n Name: " +getName()+"\n Nationality: "+getDesignation()+
                "\n Company: " + companyName + "\n"+coding()+"\n"+learn()+"\n"+walk()+
                "\n"+eat();
    }
}
