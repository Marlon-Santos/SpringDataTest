package br.com.gft.crud.resource;

import br.com.gft.crud.model.Cadastro;
import br.com.gft.crud.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {
    @Autowired
    private CadastroRepository cadastroRepository;

    @GetMapping
    public List<Cadastro> read() {
        return cadastroRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cadastro> create(@RequestBody Cadastro cadastro, HttpServletResponse response) {
        Cadastro cadastroSalva = cadastroRepository.save(cadastro);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(cadastroSalva.getId()).toUri();
        response.setHeader("Location", uri.toASCIIString());
        return ResponseEntity.created(uri).body(cadastroSalva);
    }

    @GetMapping("/{id}")
    public java.util.Optional<Cadastro> findToId(@PathVariable Long id) {
        return cadastroRepository.findById(id);
    }
}