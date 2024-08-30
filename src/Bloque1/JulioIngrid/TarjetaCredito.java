package Bloque1.JulioIngrid;

public class TarjetaCredito extends Pago {

    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void procesarPago() {
        System.out.println("Procesando pago con tarjeta de credito");
    }

    public void verificarLimiteCredito() {
        System.out.println("Verificando limite de credito");
    }


}
