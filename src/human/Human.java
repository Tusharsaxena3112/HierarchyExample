package human;

public class Human {
    private String eyes;
    private String legs;
    private String hairs;
    private String nose;
    private String hands;

    public Human(String eyes, String legs, String hairs, String nose, String hands) {
        this.eyes = eyes;
        this.hairs = hairs;
        this.hands = hands;
        this.legs = legs;
        this.nose = nose;

    }

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
        return String.format("I am a Human . I have some properties which are inherited by my other subclasses ");
    }


}
