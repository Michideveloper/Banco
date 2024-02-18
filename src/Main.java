import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(0, 0.0f);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(0, 0.0f);

        Banco bbva = new Banco(cuentaAhorros, cuentaCorriente);

        bbva.setContentPane(bbva.getJpVentanaMenu());
        bbva.getJpVentanaMenu().setAlignmentX(Component.CENTER_ALIGNMENT);
        bbva.setExtendedState(JFrame.MAXIMIZED_BOTH);
        bbva.setUndecorated(true);
        bbva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bbva.setResizable(false);
        bbva.pack();
        bbva.setVisible(true);

    }
}
