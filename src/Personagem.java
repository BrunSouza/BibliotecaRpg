public class Personagem {
    private String nome;
    private String classe;
    private int level;
    private String antecedente;

    public Personagem(String nome, String classe, int level, String antecedente){
        this.nome = nome;
        this.classe = classe;
        this.level = level;
        this.antecedente = antecedente;
    }

    public String getNome(){
        return nome;
    }
    public String getClasse(){
        return classe;
    }
    public int getLevel(){
        return level;
    }
    public String getAntecedente(){
        return antecedente;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setAntecedente(String antecedente){
        this.antecedente = antecedente;
    }

}
