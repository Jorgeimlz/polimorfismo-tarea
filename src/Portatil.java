public class Portatil extends DispositivoElectronico {
    private double tamanoPantalla;

    // Constructor
    public Portatil(String marca, String modelo, double tamanoPantalla) {
        super(marca, modelo);
        this.tamanoPantalla = tamanoPantalla;
    }

    // Método sobreescrito para mostrar información del portátil
    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Tamaño de Pantalla: " + tamanoPantalla + " pulgadas");
    }
}

