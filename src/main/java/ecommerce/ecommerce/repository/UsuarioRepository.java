package ecommerce.ecommerce.repository;

import ecommerce.ecommerce.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
}
