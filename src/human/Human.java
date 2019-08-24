package human;

public class Human {
    private String eyes = "Two";
    private String legs = "Two";
    private String hairs = "Uncountable";
    private String nose = "One";
    private String hands = "Two";


    public String getEyes() {
        return eyes;
    }

    public String getLegs() {
        return legs;
    }

    public String getHairs() {
        return hairs;
    }


    public String getNose() {
        return nose;
    }

    public String getHands() {
        return hands;
    }

    public String toString() {
        return "I am a Human . I have some properties which are inherited by my other subclasses ";
    }


}
