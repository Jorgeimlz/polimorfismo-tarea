public abstract class DispositivoElectronico {
    private String marca;
    private String modelo;

    // Constructor
    public DispositivoElectronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método para encender el dispositivo
    public void encender() {
        System.out.println("El dispositivo " + modelo + " está encendido.");
    }

    // Método para apagar el dispositivo
    public void apagar() {
        System.out.println("El dispositivo " + modelo + " está apagado.");
    }

    // Método abstracto para mostrar información
    public abstract void mostrarInformacion();
}
