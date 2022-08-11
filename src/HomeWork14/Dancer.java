package HomeWork14;

public class Dancer extends Person {
    private String groupName;
    private String dancing;
   public Dancer(String name , String designation,String learn,String walk, String eat , String groupName, String dancing ){
       super(name,designation,learn,walk,eat);
       this.groupName= groupName;
       this.dancing=dancing;
   }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", dancing='" + dancing + '\'' +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public String getDancing() {
        return dancing;
    }
}
