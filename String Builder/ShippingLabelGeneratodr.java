import java.util.Scanner;

public class ShippingLabelGeneratodr {
    public String generateShippingLabel() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del remitente: "); String nombreRemitente = sc.nextLine();
        System.out.print("Ingrese la dirección del remitente: "); String direccionRemitente = sc.nextLine();
        System.out.print("Ingrese el nombre del destinatario: "); String nombreDestinatario = sc.nextLine();
        System.out.print("Ingrese la dirección del destinatario: "); String direccionDestinatario = sc.nextLine();
        System.out.print("Ingrese la descripción del producto: "); String descripcionProducto = sc.nextLine();
        System.out.println();

        if (nombreRemitente.isEmpty() || direccionRemitente.isEmpty() || nombreDestinatario.isEmpty() || direccionDestinatario.isEmpty() || descripcionProducto.isEmpty()) {
            throw new RuntimeException("Llene todos los datos. Por favor intente de nuevo");
        } else {
            sb.append("\u001B[32m").append("ETIQUETA DE ENVÍO").append("\u001B[0m").append(("\n"));

            sb.append("\u001B[35m").append("Nombre del remitente: ").append("\u001B[0m").append(nombreRemitente).append(("\n"));
            sb.append("\u001B[35m").append("Dirección del remitente: ").append("\u001B[0m").append(direccionRemitente).append(("\n"));
            sb.append("\u001B[35m").append("Nombre del destinatario: ").append("\u001B[0m").append(nombreDestinatario).append(("\n"));
            sb.append("\u001B[35m").append("Dirección del destinatario: ").append("\u001B[0m").append(direccionDestinatario).append(("\n"));
            sb.append("\u001B[35m").append("Producto enviado: ").append("\u001B[0m").append(descripcionProducto).append(("\n"));
        }

        return sb.toString();
    }
}
