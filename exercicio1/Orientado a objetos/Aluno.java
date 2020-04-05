public class Aluno {
    //Atributos
    private String nome;
    private double p1;
    private double p2;

    public Aluno(String nome) {
        super();
        this.nome = nome;
    }

    public void setNotaP1(double nota) {
        this.p1 = nota;
    }

    public void setNotaP2(double nota) {
        this.p2 = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isAprovado() {
        double media = (this.p1 + this.p2) / 2.0;
        if(media<6.0) {
            return false;
        }
        return true;
    }

    public String toString() {
        if(this.isAprovado()) {
            return "O aluno "+this.nome+" foi aprovado.";
       } else{       
            return "O aluno "+this.nome+" foi reprovado.";
        // return "O aluno "+this.nome+(this.isAprovado()?" foi aprovado.":" reprovou.");
        }
    }
}