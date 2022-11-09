public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public String dancing(){
       return getName()+" is good dancing";
    }

    @Override
    public String toString() {
        return "Dancer: \n Name: " +getName()+"\n Nationality: "+getDesignation()+
                "\n GroupName: " + groupName + "\n"+dancing()+"\n"+learn()+"\n"+walk()+
                "\n"+eat();
    }
}
