public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public String getString(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return "Pessoa: " + pessoa + " | " + "Idade: " + idade;
    }
    
}