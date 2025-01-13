public class Gato implements Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El gato maúlla: ¡Miau miau!");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo.");
    }
}