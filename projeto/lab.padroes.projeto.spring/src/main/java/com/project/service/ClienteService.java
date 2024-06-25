package main.java.com.project.service;

import main.java.com.project.model.Cliente;;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(long id);
    void inserir(Cliente cliente);
    void atualizar(long id, Cliente cliente);
    void deletar(long id);
}
