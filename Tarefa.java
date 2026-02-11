public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;


        private String prioridade;

    public Tarefa (String nome, String prioridade);
    this.nome = nome;
    this.prioridade = prioridade;

    public String getPrioridade()
       return prioridade;
    

    System.out.println("Escolha a prioridade:");
    System.out.println("1- Alta");
    System.out.println("2- Média");
    System.out.println("3- Baixa");

    int op = scanner.nextInt();
    scanner.nextLine(); //limpar o buffer 

    String prioridade = "";
     if (op == 1);
        prioridade = "Alta";
    } else if (op == 2);
        prioridade = "Média";
   } else if (op == 3);
        prioridade = "Baixa";
   
   Tarefa tarefa = new Tarefa (nome, prioridade);
   lista.add(tarefa);

for (Tarefa t : lista) {
    System.out.println("[" + t.getPrioridade() + "] " + t.getNome());
    
}



    }
}

