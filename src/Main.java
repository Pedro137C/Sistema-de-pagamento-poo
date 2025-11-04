import java.time.LocalDate;

/**
 * RF5: Método 'main()' para adicionar diferentes tipos de pagamentos
 * e executar o processamento.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Criar o CaixaFinanceiro
        CaixaFinanceiro caixa = new CaixaFinanceiro();

        // 2. Criar diferentes tipos de pagamentos
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);

        Pagamento pag1 = new PagamentoCartaoCredito(150.75, hoje);
        Pagamento pag2 = new PagamentoPix(89.90, hoje);
        Pagamento pag3 = new PagamentoBoleto(350.00, amanha);
        Pagamento pag4 = new PagamentoCartaoCredito(1200.00, hoje);

        // 3. Adicionar pagamentos ao caixa
        caixa.adicionarPagamento(pag1);
        caixa.adicionarPagamento(pag2);
        caixa.adicionarPagamento(pag3);
        caixa.adicionarPagamento(pag4);

        // 4. Executar todos os pagamentos de forma polimórfica
        caixa.executarPagamentos();
    }
}