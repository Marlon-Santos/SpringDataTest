package br.com.gft.crud.resource;

import br.com.gft.crud.model.User;
import br.com.gft.crud.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {
    @Autowired
    private CadastroRepository cadastroRepository;

    @GetMapping
    public List<User> read() {
        return cadastroRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user, HttpServletResponse response) {
        User userSalva = cadastroRepository.save(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(userSalva.getId()).toUri();
        response.setHeader("Location", uri.toASCIIString());
        return ResponseEntity.created(uri).body(userSalva);
    }

    @GetMapping("/{id}")
    public java.util.Optional<User> findToId(@PathVariable Long id) {
        return cadastroRepository.findById(id);

    }
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
                                 @RequestBody User user) {
        return cadastroRepository.findById(id)
                .map(record -> {
                    record.setName(user.getName());
                    record.setEmail(user.getEmail());
                    record.setActive(user.getActive());
                    User updated = cadastroRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}