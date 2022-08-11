package HomeWork14;

public class Singer  extends Person{
    private String singing;
    private String bandName;
    private String playGuitar;
    public Singer(String name,String designation,String learn,String walk,String eat, String singing , String bandName,String playGuitar){
        super(name,designation,learn,walk , eat);
        this.singing=singing;
        this.bandName=bandName;
        this.playGuitar=playGuitar;
}

    public String getSinging() {
        return singing;
    }

    public String getBandName() {
        return bandName;
    }

    public String getPlayGuitar() {
        return playGuitar;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singing='" + singing + '\'' +
                ", bandName='" + bandName + '\'' +
                ", playGuitar='" + playGuitar + '\'' +
                '}';
    }
}
