public class Estudiante extends Persona {
    private String carrera;
    
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carrera: " + carrera);
        System.out.println("Hobbies:");
        for (String hobby : getHobbies()) {
            System.out.println(hobby);
        }
    }
}