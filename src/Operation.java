import java.security.spec.ECField;

public class Operation extends Exception {
    private int alfa;
    private int numerador;
    private int denominador;

    public Operation(int numerador, int denominador) throws Exception {

        this.denominador = denominador;
        this.numerador = numerador;

        try {
            this.alfa = numerador/denominador;
        }
        catch (Exception e){
            throw new Exception("Operacion Invalida porfavor ingrese numeros validos");

        }


    }
    public void imprimir(){
        try{
            System.out.println("El resultao de la operacion es " + alfa);
        }
        finally {
            System.out.println("Se realizo una operacion\n");
        }

    }

    public static void main(String[] args) throws Exception {
        Operation operacion1 = new Operation(10,5);
        operacion1.imprimir();
        Operation operacion2 = new Operation(20,4);
        operacion2.imprimir();;
        Operation operacion3  = new Operation(6,0);
        operacion3.imprimir();
        Operation operacion4 = new Operation(45,3);
        operacion4.imprimir();

    }
}
