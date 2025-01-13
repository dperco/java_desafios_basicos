public class Perro implements Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo.");
    }
}