public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){

    }

    public String getString(){
        return this.nome;
    }

    public void setString(String nome){
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