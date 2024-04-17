package BancoM;

public class Main {
    public static void main(String[] args) {
        // Crear un banco
        Banco miBanco = new Banco("MuchoDinero");

        // Adicionar cuentas al banco
        miBanco.adicionarCuenta("001", 1000.0, "corriente", "123456789", "Juan Perez");
        miBanco.adicionarCuenta("002", 2000.0, "ahorro", "987654321", "Maria Lopez");

        // Consultar el total de dinero en el banco
        System.out.println("Total de dinero en el banco: " + miBanco.consultarTotalDinero());

        // Consultar el cliente con mayor saldo
        System.out.println("Cliente con mayor saldo: " + miBanco.consultarClienteMayorSaldo());
    }
}


