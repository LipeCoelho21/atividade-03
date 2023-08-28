import java.time.LocalDate; //importando biblioteca de data

public class App { // execução do programa principal
    public static void main(String[] args) {
        
        LocalDate dataNascimento = LocalDate.of(1990, 5, 15);
        LocalDate dataMatricula = LocalDate.now();
        LocalDate dataInsercao = LocalDate.now();


        Pessoa aluno1 = new Aluno(1, "João", "Rua ABC", "99223-4566", 
        dataNascimento,"223563", "002003004-01", dataInsercao, "789456", dataMatricula);
        

        String nomeDaPessoa = aluno1.getNome();
        System.out.println("Nome: " + nomeDaPessoa);

        aluno1.setNome("Maria");
        System.out.println("Novo nome: " + aluno1.getNome());
        System.out.println("Novo aluno inserido: ");   
        System.out.println(aluno1); 
    }
    
}
