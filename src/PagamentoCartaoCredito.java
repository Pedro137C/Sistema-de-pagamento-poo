import java.time.LocalDate;

/**
 * RF2: Subclasse concreta PagamentoCartaoCredito.
 */
public class PagamentoCartaoCredito extends Pagamento {

    public PagamentoCartaoCredito(double valor, LocalDate data) {
        // Chama o construtor da superclasse (Pagamento)
        super(valor, data);
    }

    /**
     * RF3: Sobrescreve 'processarPagamento()' com uma mensagem específica. [cite: 52]
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) +
                " via Cartão de Crédito em " + data + " processado.");
        // Aqui entraria a lógica de API de cartão, verificação de limite, etc.
    }
}