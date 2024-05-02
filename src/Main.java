public class Main {
    public static void main(String[] args) {
        DispositivoElectronico smartphone = new SmartPhone("Samsung", "Galaxy S22", 4000);
        DispositivoElectronico portatil = new Portatil("Dell", "XPS 15", 15.6);

        smartphone.encender();
        portatil.encender();

        smartphone.mostrarInformacion();
        portatil.mostrarInformacion();

        smartphone.apagar();
        portatil.apagar();
    }
}
