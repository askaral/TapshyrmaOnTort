public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
    public String learn(){
        return name+" is learn";

    }
    public String walk(){
        return name+" walk";
    }
    public String eat(){
        return name+" is eating";
    }
}

