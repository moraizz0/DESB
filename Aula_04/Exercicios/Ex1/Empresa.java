// Aula 04 - 24/08/2026 - Exercício 1 
// Daniel Alves  de Morais - 26162686
// Crie uma classe chamada Empresa. A classe deve ter os atributos provados:
// - codigo 
// - razaoSocial
// - numeroFuncionarios
// Crie um construtor que receba os três valores. Implemente getters e setters.
// O setter setNumeroFuncionario() deve impedir números negativos

package Exercicios.Ex1;

public class Empresa {
    private Int codigo;
    private String razaoSocial;
    private Int numeroFuncionarios;

    public Empresa(
        Int codigo,
        String razaoSocial,
        Int numeroFuncionarios){
            setcodigo(codigo);
            setrazaoSocial(razaoSocial);
            setnumeroFuncionarios(numeroFuncionarios); 
        }

}
