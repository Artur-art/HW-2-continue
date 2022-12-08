public class Flower {
    String flowerName;
    String country;
    double cost;
    double lifeSpan;


    Flower(String flowerName,String country,double cost,double lifeSpan){
        setFlowerName(flowerName);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }
    public double getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(double lifeSpan) {
        if(lifeSpan <= 0){
            this.lifeSpan = 3;
        }else{
            this.lifeSpan = lifeSpan;
        }
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        if(cost <= 0){
            this.cost = 1;
        }else{
            this.cost = cost;
        }

    }
    public String getFlowerName() {
        return flowerName;
    }
    public void setFlowerName(String flowerName) {
        if(flowerName == null || flowerName.isEmpty() || flowerName.isBlank()){
            this.flowerName = "flower name is not avaible";
        }else{
            this.flowerName = flowerName;
        }
    }


    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        if(country != null && !country.isEmpty() && !country.isBlank()){
            this.country = country;
        }else {
            this.country = "Russia";
        }
    }

        void flover(){
            System.out.println(flowerName);
            System.out.println("from " + country);
            System.out.println("price " + cost);
            System.out.println("Life span " + lifeSpan);

        }
    }

