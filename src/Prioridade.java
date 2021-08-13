public enum Prioridade {

    BAIXA(1), MEDIA(5), ALTA(10);

    private int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }


}
