class Continent {
    public Continent(String continent) {
        System.out.println(continent);
    }
}

class Country extends Continent {
    public Country(String continent, String country) {
        super(continent);
        System.out.println(country);
    }
}

class State extends Country {
    public State(String continent, String country, String state, String place) {
        super(continent, country);
        System.out.println(state);
        System.out.println(place);
    }
}

public class eight {
    public static void main(String[] args) {
        State s = new State("Asia", "India", "Gujarat", "Surat");
    }
}