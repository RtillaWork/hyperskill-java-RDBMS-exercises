package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordConfig {
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!#@&)(_";

    @Bean
    public PasswordSymbols allSymbols() {
        return new PasswordSymbols(ALPHA + NUMERIC + SPECIAL_CHARS);
    }

    static class PasswordSymbols {
        private final String symbols;

        public PasswordSymbols(String symbols) {
            this.symbols = symbols;
        }

        String getSymbols() {
            return symbols;
        }
    }
}
