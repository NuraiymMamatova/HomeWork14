package HomeWork14;

public class Programmer extends Person {
    private String companyName;
    private String coding;

public Programmer(String name,String designation,String learn, String walk,String eat,String companyName , String coding ){
    super(name,designation,learn,walk,eat);
    this.companyName=companyName;
    this.coding= coding;
}

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                ", coding='" + coding + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCoding() {
        return coding;
    }
}