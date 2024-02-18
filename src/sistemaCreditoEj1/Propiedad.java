package sistemaCreditoEj1;

public class Propiedad {
    private String direccion;
    private int valor;

    public Propiedad(String direccion, int valor) {
        this.direccion = direccion;
        this.valor = valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
