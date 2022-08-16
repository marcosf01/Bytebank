public class App {
    public static void main(String[] args) throws Exception {
        Conta contaDoMarcos = new Conta();

        contaDoMarcos.setAgencia(1497);
        contaDoMarcos.setNumeroConta(11569);
        contaDoMarcos.deposita(150);

        Cliente marcos = new Cliente();

        marcos.setNome("Marcos Felipe");
        marcos.setCpf("123.456.789-12");
        marcos.setProfissao("Backend Developer");

        contaDoMarcos.setTitular(marcos);

        System.out.println("Titular da conta: " + 
            contaDoMarcos.getTitular().getNome());

        System.out.println("Saldo: " + contaDoMarcos.getSaldo());

        Conta contaDaMarcela = new Conta();

        contaDoMarcos.transfere(80, contaDaMarcela);
        System.out.println("Transferência feita para Marcela!");

        
        System.out.println("Saldo Marcela: R$ " + contaDaMarcela.getSaldo());
        System.out.println("Saldo Marcos: R$ " + contaDoMarcos.getSaldo());

        Cliente marcela = new Cliente();

        marcela.setNome("Marcela");

        contaDaMarcela.setTitular(marcela);

        System.out.println(contaDaMarcela.getTitular().getNome());

        Conta contaDoVictor = new Conta(5874, 56987);

        System.out.println(contaDoVictor.getSaldo());

        Conta contaTeste1 = new Conta(50, 2405, 32165);
        Conta contaTeste2 = new Conta(2441, 12345);
    }
}
