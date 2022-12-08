public class Person {
    String name;
    private int yearOfBirth;
    private String town;
    String job;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            System.out.println("information for this employer is incorrect");
        } else{
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if(town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else{
            System.out.println("information for this employer is incorrect");
        }
    }

    Person (String name, int yearOfBirth, String town, String job){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
        /*if(yearOfBirth>=0){
            this.yearOfBirth = yearOfBirth;
        } else{
            this.yearOfBirth = 0;
        }*/
        if(name == null || name == " " || name == ""){
            System.out.println("information for this employer is incorrect");
        } else{
            this.name = name;
        }
        if(town == null || town == " " || town == ""){
            System.out.println("information for this employer is incorrect");
        } else{
            this.town = town;
        }
        if(job == null || job == " " || job == ""){
            System.out.println("information for this employer is incorrect");
        } else{
            this.job = job;
        }

    }



    void hello(){
        System.out.println("Hello");
        System.out.println("My name is " + name);
        System.out.println("I from " + town);
        System.out.println("My year of birth " + yearOfBirth);
        System.out.println("My job is" + job);
        System.out.println("nice to meet you");
    }

}
