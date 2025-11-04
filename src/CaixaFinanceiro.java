import java.util.ArrayList;
import java.util.List;

/**
 * RF4: Classe 'CaixaFinanceiro' com uma lista de pagamentos
 * e um método 'executarPagamentos()'.
 */
public class CaixaFinanceiro {

    // A lista é do tipo ABSTRATO 'Pagamento'
    private List<Pagamento> pagamentosPendentes;

    public CaixaFinanceiro() {
        this.pagamentosPendentes = new ArrayList<>();
    }

    /**
     * Método auxiliar para adicionar pagamentos à lista.
     * Aceita qualquer objeto que seja um 'Pagamento'.
     */
    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamentosPendentes.add(pagamento);
    }

    /**
     * RF4: Método para executar todos os pagamentos.
     * * POLIMORFISMO: O método itera sobre a lista de 'Pagamento'
     * e chama 'p.processarPagamento()'. A JVM (Java Virtual Machine)
     * decide em tempo de execução qual método 'processarPagamento()'
     * deve ser chamado (o do Pix, o do Boleto ou o do Cartão),
     * com base no tipo real do objeto 'p'.
     */
    public void executarPagamentos() {
        System.out.println("--- Iniciando Processamento de Pagamentos ---");

        if (pagamentosPendentes.isEmpty()) {
            System.out.println("Nenhum pagamento pendente.");
            return;
        }

        for (Pagamento p : pagamentosPendentes) {
            // A mágica do polimorfismo acontece aqui!
            p.processarPagamento();
        }

        System.out.println("--- Processamento Concluído ---");

        // Limpa a lista após o processamento
        pagamentosPendentes.clear();
    }
}