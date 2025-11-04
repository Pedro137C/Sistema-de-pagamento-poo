import java.time.LocalDate;

/**
 * RF2: Subclasse concreta PagamentoBoleto.
 */
public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor, LocalDate data) {
        super(valor, data);
    }

    /**
     * RF3: Sobrescreve 'processarPagamento()' com uma mensagem específica. [cite: 52]
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) +
                " com Boleto (vencimento " + data + ") registrado.");
        // Aqui entraria a lógica de registro de boleto e envio ao banco.
    }
}