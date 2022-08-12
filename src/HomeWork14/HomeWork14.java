package HomeWork14;

public class HomeWork14 {
    public static void main(String[]args){
    Programmer programmer = new Programmer("Mark Zuckerberg",
            "I am a programmer and I  am coding",
            "It",
            "Keyboard",
            "Information",
            "Meta",
            "Facebook");

    Dancer dancer = new Dancer("Michael Jackson",
            "I am a dancer and I can dance",
            "Сhoreography",
            "On the floor",
            "Burritos",
            "Solus",
            "New J-Funk");

    Singer singer = new Singer("Elvis Presley",
            "I am a  singer and i am sing",
            "Song",
            "On the floor",
            "Ice-Сream",
            "Can't Help Falling in love",
            "Solus",
            "Gibson Eboy Dove");

        System.out.println("---------------Popular person---------------");
        System.out.println("----------Programmer----------");
        System.out.println("Name: "+programmer.getName());
        System.out.println("Designation: "+programmer.getDesignation());
        System.out.println("Learn: "+programmer.getLearn());
        System.out.println("Walk: "+programmer.getWalk());
        System.out.println("Eat: "+programmer.getEat());
        System.out.println("Company name: "+programmer.getCompanyName());
        System.out.println("Coding: "+programmer.getCoding());

        System.out.println("----------Dancer----------");
        System.out.println("Name: "+dancer.getName());
        System.out.println("Designation: "+dancer.getDesignation());
        System.out.println("Learn: "+dancer.getLearn());
        System.out.println("Walk: "+dancer.getWalk());
        System.out.println("Eat: "+dancer.getEat());
        System.out.println("Group name: "+dancer.getGroupName());
        System.out.println("Dancing: "+dancer.getDancing());

        System.out.println("----------Singer----------");
        System.out.println("Name: "+singer.getName());
        System.out.println("Designation: "+singer.getDesignation());
        System.out.println("Learn: "+singer.getLearn());
        System.out.println("Walk: "+singer.getWalk());
        System.out.println("Eat: "+singer.getEat());
        System.out.println("Singing: "+singer.getSinging());
        System.out.println("Band name: "+singer.getBandName());
        System.out.println("Play guitar: "+singer.getPlayGuitar());
        System.out.println("-----------------------------");







    }
}
