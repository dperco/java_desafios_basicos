import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private List<String> hobbies;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobbies = new ArrayList<>();
    }
    
    public void agregarHobby(String hobby) {
        hobbies.add(hobby);
    }

    // Métodos getter para acceder a los atributos desde la subclase
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}