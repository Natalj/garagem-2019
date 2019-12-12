package view;

import controller.MarcaController;
import controller.ModeloController;
import entity.Marca;
import entity.Modelo;

import java.util.Scanner;

public class ModeloView {

    private ModeloController modeloController = new ModeloController();
    private Modelo modelo = new Modelo();



    public void listarModelo() {


        for(Modelo m : modeloController.listar()){
            System.out.println(
                    "Id - "+ m.getId()+
                            "\nNomeMarca - " + m.getNome()+
                            "\nNomeModelo - " + m.getNome_modelo()+
                            "\nTipo - "+ m.getTipo()
            );
            System.out.println("******************************************");
        }

    }

    public void cadastrarModelo() {
        Scanner sc = new Scanner(System.in);

        MarcaController marcaController = new MarcaController();
        System.out.println("Digite a chave da marca");
        for(Marca m : marcaController.listar()){
            System.out.println(
                    "Id - "+ m.getId()+
                            "\nNome - " + m.getNome()+
                            "\n"
            );
        }

        int idMarca = sc.nextInt();

        sc.nextLine();


        System.out.println("Digite o nome do modelo");
        modelo.setNome(sc.nextLine());
        System.out.println("Digite o tipo do modelo");
        modelo.setTipo(sc.nextLine());

        if (modeloController.cadastrar(modelo,idMarca)){
            System.out.println("Modelo cadastrado");
        }else {
            System.out.println("Erro ao cadastrar modelo, tente novamente");
        }

    }

    public void alterarModelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do modelo que deseja alterar");
        int codigo = sc.nextInt();

        Modelo m = modeloController.buscar(codigo);

        if (m == null){
            System.out.println("Modelo n�o encontrado");
        }else{
            System.out.println(
                    "Id - "+ m.getId()+
                            "\nNomeMarca - " + m.getNome()+
                            "\nNomeModelo - " + m.getNome_modelo()+
                            "\nTipo - "+ m.getTipo()
            );
        }

        sc.nextLine();
        System.out.println("Digite o novo nome do modelo");
        modelo.setNome_modelo(sc.nextLine());
        System.out.println("Digite o novo tipo do modelo");
        modelo.setTipo(sc.nextLine());
        modelo.setId(codigo);

        if (modeloController.alterar(modelo)){
            System.out.println("Modelo alterado");
        }else{
            System.out.println("Erro ao alterar modelo, tente novamente");
        }

    }

    public void buscarModelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo da modelo que deseja buscar");
        int codigo = sc.nextInt();

        Modelo m = modeloController.buscar(codigo);

        if (m == null){
            System.out.println("Modelo n�o encontrado");
        }else{
            System.out.println(
                    "Id - "+ m.getId()+
                            "\nNomeMarca - " + m.getNome()+
                            "\nNomeModelo - " + m.getNome_modelo()+
                            "\nTipo - "+ m.getTipo()
            );
        }

    }

    public void excluirModelo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do modelo que deseja exlcuir");
        int codigo = sc.nextInt();

        modeloController.excluir(codigo);
    }
}
