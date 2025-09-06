import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    private App app;
    
    @BeforeEach
    void setUp() {
        app = new App();
    }
    
    @Test
    void testAppCreation() {
        assertNotNull(app, "App deve ser criada com sucesso");
    }
    
    @Test
    void testMainMethod() {
        // Teste básico para verificar se o main não lança exceção
        assertDoesNotThrow(() -> {
            App.main(new String[]{});
        }, "Método main não deve lançar exceção");
    }
}
