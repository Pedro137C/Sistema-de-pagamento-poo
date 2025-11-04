// Importação necessária para o atributo 'data'
import java.time.LocalDate;

/**
 * RF1: Classe abstrata 'Pagamento' com atributos 'valor', 'data'
 * e o método abstrato 'processarPagamento()'. [cite: 49, 50]
 */
public abstract class Pagamento {

    // Protected permite acesso pelas subclasses
    protected double valor;
    protected LocalDate data;

    // Construtor da superclasse
    public Pagamento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    // Getters
    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    /**
     * Método abstrato que força as subclasses a implementarem
     * sua própria forma de processamento.
     */
    public abstract void processarPagamento();
}