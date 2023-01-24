public class Conta {
    private double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;


    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public boolean transfere(double valor, Conta destino) {
        if (saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }
}
