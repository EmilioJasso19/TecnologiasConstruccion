package Bloque1.AdrianCaleb;

public class Logger {

    public void log(String... message) {
        System.out.println("Multiples mensajes");

        for (String m : message) {
            System.out.println(m);
        }
    }

    public <T> void log(T message) {
        System.out.println("Mensaje generico: " + message);
    }

    public void log(int level, String... messages) {
        System.out.println("Multiples mensajes con niveles:" + level);
        for (String m : messages) {
            System.out.println(m);
        }
    }
}


