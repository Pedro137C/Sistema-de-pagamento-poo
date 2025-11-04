import java.time.LocalDate;

/**
 * RF2: Subclasse concreta PagamentoPix.
 */
public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor, LocalDate data) {
        super(valor, data);
    }

    /**
     * RF3: Sobrescreve 'processarPagamento()' com uma mensagem específica. [cite: 52]
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento instantâneo de R$" + String.format("%.2f", valor) +
                " via PIX em " + data + " concluído.");
        // Aqui entraria a lógica de geração de QR Code ou chamada de API bancária.
    }
}