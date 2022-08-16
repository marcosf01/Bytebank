public class Conta {
    private double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;

    public Conta() {

    }

    public Conta(double saldo, int agencia, int numero) {
        if (saldo >= 50) {
            this.saldo = saldo;
        } else {
            System.out.println("O valor é invalido! Por isso usaremos R$ 30.0");
            this.saldo = saldo;
        }

        if (agencia >= 4100) {
            this.agencia = agencia;
        } else {
            System.out.println("Número de agência inválido. Por isso usaremos 4110");
            this.agencia = agencia;
        }

        if (numero >= 24052) {
            this.numeroConta = numero;
        } else {
            System.out.println("Número de conta inválido. Por isso usaremos 24055");
            this.numeroConta = numero;
        }
        
    }

    public Conta(int agencia, int numero) {
        this(130, agencia, numero);
    }

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
        if (agencia <= 0) {
            System.out.println("Agência não pode 0 ou valor negativo!");
            return;
        }
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumeroConta(int numero) {
        if (numero <= 0) {
            System.out.println("Número não pode 0 ou valor negativo!");
            return;
        }
        this.numeroConta = numero;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
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
