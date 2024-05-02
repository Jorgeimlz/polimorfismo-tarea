public class SmartPhone extends DispositivoElectronico {
    private int capacidadBateria; // Capacidad de la batería en mAh

    // Constructor
    public SmartPhone(String marca, String modelo, int capacidadBateria) {
        super(marca, modelo);
        this.capacidadBateria = capacidadBateria;
    }

    // Método sobreescrito para mostrar información del smartphone
    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Capacidad de Batería: " + capacidadBateria + "mAh");
    }
}
