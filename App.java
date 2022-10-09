public class App {
    public static void main(String[] args) {
        System.out.println("Inicio ejercicio de suma");
        //Llamamos a función para sumar tres números:
        System.out.println("10 + 20 + 30 = "+SumarTresNumeros.sumar(10, 20, 30));
        System.out.println("Fin ejercicio de suma\n");

        System.out.println("Inicio ejercicio de coche");
        //Creamos objeto coche:
        Coche cocheFamiliar = new Coche();
        //El objeto coche trae por defecto 2 puertas:
        System.out.println("El coche familiar no tiene: "+cocheFamiliar.getPuertas()+ " puertas");
        //Agregamos 2 puertas más:
        cocheFamiliar.setPuertas(2);
        System.out.println("El coche familiar tiene: "+cocheFamiliar.getPuertas()+" puertas");
        System.out.println("Fin ejercicio de coche");
    }
}
