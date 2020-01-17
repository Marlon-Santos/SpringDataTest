package br.com.gft.crud.resource;

import br.com.gft.crud.model.Cadastro;
import br.com.gft.crud.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {
    @Autowired
    private CadastroRepository cadastroRepository;
    @GetMapping

    public List<Cadastro> cadastro(){
       return cadastroRepository.findAll();
    }
}
