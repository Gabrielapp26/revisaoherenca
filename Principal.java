public class Principal{
    public static void main(String[] args){

        Empregado e = new Empregado();

        e.setNome("Gabriela Pellin");
        e.setEndereco("Marília");
        e.setTelefone("(14)982327572");
        e.setCargo("Gerente");
        e.setSalario(5000);

        System.out.println("Funcionário 1");
        System.out.println("Nome do funcionário: "+e.getNome());
        System.out.println("Da cidade de: "+e.getEndereco());
        System.out.println("Telefone: "+e.getTelefone());
        System.out.println("Possui o cargo de: "+e.getCargo());
        System.out.println("Salário: R$"+e.getSalario());

        Empregado e2 = new Empregado();

        e2.setNome("Éric Ruan");
        e2.setEndereco("Quintana");
        e2.setTelefone("(14)98685409");
        e2.setCargo("Programador");
        e2.setSalario(4000);

        System.out.println("Funcionário 2");
        System.out.println("Nome do funcionário: "+e2.getNome());
        System.out.println("Da cidade de: "+e2.getEndereco());
        System.out.println("Telefone: "+e2.getTelefone());
        System.out.println("Possui o cargo de: "+e2.getCargo());
        System.out.println("Salário: R$"+e2.getSalario());

    }
}