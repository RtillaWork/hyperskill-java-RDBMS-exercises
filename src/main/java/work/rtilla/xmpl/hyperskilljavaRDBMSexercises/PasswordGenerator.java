package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {
    private static final Random random = new Random();
    private final PasswordConfig.PasswordSymbols symbols;

    public PasswordGenerator(@Autowired PasswordConfig.PasswordSymbols symbols) {
        this.symbols = symbols;
    }

    public String generate(int length) {
        int symbolsCount = symbols.getSymbols().length();
        StringBuilder password =  new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(symbols.getSymbols().charAt(random.nextInt(symbolsCount)));
        }

        return password.toString();
    }
}
