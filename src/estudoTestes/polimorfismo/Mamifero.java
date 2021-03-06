package estudoTestes.polimorfismo;

public abstract class Mamifero implements Animal{

    protected String corPelo;
    protected String nome;
    protected int idade;
    protected int membros;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    @Override
    public int getMembros() {
        return this.membros;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public abstract void locomover();

    @Override
    public abstract void alimentar();

    @Override
    public abstract void emitirSom();

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
