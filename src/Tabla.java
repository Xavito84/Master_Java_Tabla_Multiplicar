import javax.swing.*;

public class Tabla {
    public static void main(String[] args) {

        String numStr = JOptionPane.showInputDialog(null, "Ingrese el número entero a multiplicar:");
        int num = 0;

        // Intentar convertir la entrada en un número entero
        try {
            num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un valor entero válido");
            main(args);  // Volver a ejecutar el método principal para pedir un valor nuevamente
            System.exit(0);  // Salir si hay un error
        }

        // Crear el mensaje con la tabla de multiplicar
        StringBuilder mensaje = new StringBuilder("Aquí tienes la tabla del: " + num);

        // Bucle para generar la tabla de multiplicar de 0 a 10
        for (int i = 0; i <= 10; i++) {
            mensaje.append("\n").append(i).append(" * ").append(num).append(" = ").append(i * num);
        }

        // Mostrar el mensaje final con la tabla
        JOptionPane.showMessageDialog(null, mensaje.toString());

    }
}
