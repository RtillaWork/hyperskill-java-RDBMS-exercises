package work.rtilla.xmpl.hyperskilljavaRDBMSexercises.persistencelayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import work.rtilla.xmpl.hyperskilljavaRDBMSexercises.businesslayer.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserById(Long id);
    User save(User user);
}
