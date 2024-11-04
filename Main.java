//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Brabon"));
        animais.add(new Gato("Malosquera"));
        animais.add(new Animal("Elefante"));

        for (Animal bicho : animais) {   // tipo objeto, variavel temporaria, lista
            bicho.emitirSom();
            }



    }
}