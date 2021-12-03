package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class aRunner implements CommandLineRunner {
    private final PasswordGenerator passwordGenerator;

    public aRunner(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }
    @Override
    public void run(String... args) {
        System.out.printf("A short password: %s\n",passwordGenerator.generate(8));
        System.out.printf("A long password: %s\n",passwordGenerator.generate(16));
    }
}
