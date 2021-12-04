package work.rtilla.xmpl.hyperskilljavaRDBMSexercises.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.rtilla.xmpl.hyperskilljavaRDBMSexercises.persistencelayer.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User save(User userToSave) {
        return userRepository.save(userToSave);
    }
}
