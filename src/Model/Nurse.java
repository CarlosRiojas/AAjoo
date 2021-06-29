package Model;

public class Nurse extends User{

        private String specialty;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void ShowDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutriologia, Pediatria");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
