package work.rtilla.xmpl.hyperskilljavaRDBMSexercises.presentationlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import work.rtilla.xmpl.hyperskilljavaRDBMSexercises.businesslayer.User;
import work.rtilla.xmpl.hyperskilljavaRDBMSexercises.businesslayer.UserService;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable long id) {
        return new ResponseEntity<>(userService.findUserById(id).get(), HttpStatus.NOT_FOUND);
    }

    @PostMapping(path = "/user")
    public ResponseEntity<User> saveUser(@RequestBody User userToSave) {
        // TODO validation here...
        User user = userService.save(userToSave);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
