package Bloque1.JulioIngrid;

public class PayPal extends Pago{

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    void procesarPago() {
        System.out.println("Procesando Pago con PayPal");
    }

    public void enviarRecibo() {
        System.out.println("Enviando Recibo");
    }

}
