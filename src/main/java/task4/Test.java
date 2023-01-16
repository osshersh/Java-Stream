package task4;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Doctors doctors = new Doctors();
        List<String> medicalSpecification = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

       doctors.getMedicalSpeciality(medicalSpecification);
    }
}
