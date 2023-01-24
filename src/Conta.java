public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
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
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
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
