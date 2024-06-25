package main.java.com.project.service.impl;

import main.java.com.project.model.Cliente;
import main.java.com.project.model.ClienteRepository;
import main.java.com.project.model.EnderecoRepository;
import main.java.com.project.service.ClienteService;
import main.java.com.project.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    private void salvarClientePorCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep.orElseGet(()->{
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        }));
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    };
    @Override
    public Cliente buscarPorId(long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    };
    @Override
    public void inserir(Cliente cliente){
        salvarClientePorCep(cliente);
    };
    @Override
    public void atualizar(long id, Cliente cliente){
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            salvarClientePorCep(cliente);
        }
    };
    @Override
    public void deletar(long id){
        clienteRepository.deleteById(id);
    };
    
}
