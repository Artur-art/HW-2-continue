public class Main {
    public static void main(String[] args){
        Person artur = new Person("Artur",1993,"California"," Java programmer");
        artur.hello();
        Person billy = new Person ("William",1992,"San Francisco", " QA engineer");
        billy.hello();
        billy.setYearOfBirth(1990);
        billy.getYearOfBirth();
        Person paola = new Person("Paola",1990,"Ottava", " ui/ux designer");
        paola.hello();
        Person vladimir = new Person("Vladimir",1980,"Berlin"," product owner");
        vladimir.hello();
        Person lyuis = new Person("Lyuis",2000,"Santiago","unemployed");
        lyuis.hello();

        System.out.println("welcome to America");
        Flower rose = new Flower("Rose","USA",1.5,2);
        rose.flover();
        Flower sakura = new Flower("sakura","Japan",1,5);
        sakura.flover();
        System.out.println("my flover");


    }
}