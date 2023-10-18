package polimorfismo;

import polimorfismo.model.Animal;
import polimorfismo.model.Cachorro;
import polimorfismo.model.Gato;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.fazerSom();
        cachorro.fazerSom();
    }
}
