import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Banco extends JFrame {
    private JPanel jpVentanaMenu;
    private JLabel lblSaldoInicial;
    private JTextField txtfSaldoInicial;
    private JButton btnCrearCuentaAhorros;
    private JLabel lblMovimientosCuentaAhorros;
    private JLabel lblCantidadCuentaAhorros;
    private JTextField txtfCantidadCuentaAhorros;
    private JButton btnDepositarCuentaAhorros;
    private JButton btnRetirarCuentaAhorros;
    private JButton btnImprimirCuentaAhorros;
    private JLabel lblMovimientoCuentaCorriente;
    private JLabel lblCantidadCuentaCorriente;
    private JTextField txtfCantidadCuentaCorriente;
    private JButton btnDepositarCuentaCorriente;
    private JButton btnRetirarCuentaCorriente;
    private JButton btnImprimirCuentaCorriente;
    private JButton btnCrearCuentaCorriente;
    private JTextField txtfTasaAnual;
    private JLabel lblTasaAnual;
    private JPanel jpCuentaAhorros;
    private JPanel jpCuentaCorriente;
    private JPanel jpCuentaValores;

    Banco(){
        super();
    }

    Banco(CuentaAhorros cuentaAhorros, CuentaCorriente cuentaCorriente) {
        super();

        final float[] saldoInicial = {0};
        final float[] tasaAnual = {0};
        final float[] cantidadDepositar = {0};
        final float[] cantidadRetirar = {0};


        btnCrearCuentaCorriente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                tasaAnual[0] = Float.parseFloat(txtfTasaAnual.getText());
                cuentaCorriente.tasaAnual = tasaAnual[0];

                saldoInicial[0] = Float.parseFloat(txtfSaldoInicial.getText());
                cuentaCorriente.saldo = saldoInicial[0];

                System.out.println(cuentaCorriente);

                JOptionPane.showMessageDialog(
                        null,
                        cuentaCorriente.toString().toUpperCase(),
                        "INFORMACIÓN CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );


            }
        });

        btnCrearCuentaAhorros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                tasaAnual[0] = Float.parseFloat(txtfTasaAnual.getText());
                cuentaAhorros.tasaAnual = tasaAnual[0];

                saldoInicial[0] = Float.parseFloat(txtfSaldoInicial.getText());
                cuentaAhorros.saldo = saldoInicial[0];

                JOptionPane.showMessageDialog(
                        null,
                        cuentaAhorros.toString().toUpperCase(),
                        "INFORMACIÓN CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaAhorros);
            }
        });

        btnDepositarCuentaAhorros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                cantidadDepositar[0] = Float.parseFloat(txtfCantidadCuentaAhorros.getText());
                cuentaAhorros.depositar(cantidadDepositar[0]);

                JOptionPane.showMessageDialog(
                        null,
                        "SE DEPOSITARON: $" + cantidadDepositar[0],
                        "DEPOSITAR - CUENTA AHORROS",
                        JOptionPane.INFORMATION_MESSAGE
                );

                JOptionPane.showMessageDialog(
                        null,
                        cuentaAhorros.toString().toUpperCase(),
                        "DEPOSITAR - CUENTA AHORROS",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaAhorros);
            }
        });

        btnRetirarCuentaAhorros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                cantidadRetirar[0] = Float.parseFloat(txtfCantidadCuentaAhorros.getText());
                cuentaAhorros.retirar(cantidadRetirar[0]);

                JOptionPane.showMessageDialog(
                        null,
                        "SE RETIRARON: $" + cantidadRetirar[0],
                        "RETIRAR - CUENTA AHORROS",
                        JOptionPane.INFORMATION_MESSAGE
                );

                JOptionPane.showMessageDialog(
                        null,
                        cuentaAhorros.toString().toUpperCase(),
                        "RETIRAR - CUENTA AHORROS",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaAhorros);
            }
        });

        btnImprimirCuentaAhorros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JOptionPane.showMessageDialog(
                        null,
                        cuentaAhorros.toString().toUpperCase(),
                        "IMPRIMIR - CUENTA AHORROS",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaAhorros);
            }
        });

        // Cuenta corriente botones
        btnDepositarCuentaCorriente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                cantidadDepositar[0] = Float.parseFloat(txtfCantidadCuentaCorriente.getText());
                cuentaCorriente.depositar(cantidadDepositar[0]);

                JOptionPane.showMessageDialog(
                        null,
                        "SE DEPOSITARON: $" + cantidadDepositar[0],
                        "DEPOSITAR - CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );

                JOptionPane.showMessageDialog(
                        null,
                        cuentaCorriente.toString().toUpperCase(),
                        "DEPOSITAR - CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaCorriente);
            }
        });

        btnRetirarCuentaCorriente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                cantidadRetirar[0] = Float.parseFloat(txtfCantidadCuentaCorriente.getText());
                cuentaCorriente.retirar(cantidadRetirar[0]);

                JOptionPane.showMessageDialog(
                        null,
                        "SE RETIRARON: $" + cantidadRetirar[0],
                        "RETIRAR - CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );

                JOptionPane.showMessageDialog(
                        null,
                        cuentaCorriente.toString().toUpperCase(),
                        "RETIRAR - CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaCorriente);
            }
        });

        btnImprimirCuentaCorriente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JOptionPane.showMessageDialog(
                        null,
                        cuentaCorriente.toString().toUpperCase(),
                        "IMPRIMIR - CUENTA CORRIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );

                System.out.println(cuentaCorriente);
            }
        });
    }


    public JPanel getJpVentanaMenu() {
        return jpVentanaMenu;
    }

    public void setJpVentanaMenu(JPanel jpVentanaMenu) {
        this.jpVentanaMenu = jpVentanaMenu;
    }

    public JTextField getTxtfSaldoInicial() {
        return txtfSaldoInicial;
    }

    public void setTxtfSaldoInicial(JTextField txtfSaldoInicial) {
        this.txtfSaldoInicial = txtfSaldoInicial;
    }

    public JTextField getTxtfTasaAnual() {
        return txtfTasaAnual;
    }

    public void setTxtfTasaAnual(JTextField txtfTasaAnual) {
        this.txtfTasaAnual = txtfTasaAnual;
    }

    //Metodos

}
