public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    public String singing(){
        return getName()+" is beautiful singer";
    }
    public String playGuitar(){
        return getName()+" plays the guitar very well";
    }

    @Override
    public String toString() {
        return "Singer: \n Name: " +getName()+"\n Nationality: "+getDesignation()+
                "\n BandName: " +bandName + "\n"+singing()+"\n"+playGuitar()+"\n"+learn()+"\n"+walk()+
                "\n"+eat();
    }
}
