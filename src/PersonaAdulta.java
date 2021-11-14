public class PersonaAdulta {
    private String nombre;
    private int edad;

    public PersonaAdulta(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        if (edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
    }
    public void imprimir() {
        System.out.println(nombre + " - " + edad);
    }

    public static void main(String[] ar) {
        try {
            PersonaAdulta persona1 = new PersonaAdulta("Ana", 54);
            persona1.imprimir();
            PersonaAdulta persona3 = new PersonaAdulta("Antonio", 50);
            persona3.imprimir();
            PersonaAdulta persona4 = new PersonaAdulta("Juan", 19);
            persona4.imprimir();
            PersonaAdulta persona5 = new PersonaAdulta("Cristel", 12);
            persona5.imprimir();
            /**Una vez que la excepcion es lanzada, el codigo se termina de ejecutar y se detiene**/
            PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
            persona2.imprimir();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}