package BancoM;
    import java.util.ArrayList;
    import java.util.List;
    
public class Banco {


        private String nombre;
        private List<Cuenta> cuentas;
    
        public Banco(String nombre) {
            this.nombre = nombre;
            this.cuentas = new ArrayList<>();
        }
    
        public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, String cedulaTitular, String nombreTitular) {
            Cliente titular = new Cliente(cedulaTitular, nombreTitular);
            Cuenta cuenta = new Cuenta(numero, saldoInicial, tipo, titular);
            return cuentas.add(cuenta);
        }
    
        public Cuenta buscarCuenta(String numero) {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getNumero().equals(numero)) {
                    return cuenta;
                }
            }
            return null;
        }
    
        public double consultarTotalDinero() {
            double total = 0.0;
            for (Cuenta cuenta : cuentas) {
                total += cuenta.getSaldo();
            }
            return total;
        }
    
        public String consultarClienteMayorSaldo() {
            String clienteMayorSaldo = null;
            double maxSaldo = Double.MIN_VALUE;
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getSaldo() > maxSaldo) {
                    maxSaldo = cuenta.getSaldo();
                    clienteMayorSaldo = cuenta.getTitular().getNombre();
                }
            }
            return clienteMayorSaldo;
        }
    }