
public class Pajaro implements Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El pájaro canta: ¡Pío pío!");
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo.");
    }
}