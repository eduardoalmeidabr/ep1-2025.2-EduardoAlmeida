# Guia de Testes - MedScheduler

## Configuração do JUnit 5

O projeto MedScheduler foi configurado com JUnit 5 (Jupiter) para execução de testes unitários.

### Estrutura do Projeto

```
MedScheduler/
├── src/                    # Código fonte principal
│   └── App.java
├── test/                   # Código de testes
│   └── java/
│       └── AppTest.java
├── lib/                    # Bibliotecas JAR
│   ├── junit-jupiter-api-5.10.1.jar
│   ├── junit-jupiter-engine-5.10.1.jar
│   └── junit-platform-console-standalone-1.10.1.jar
├── bin/                    # Classes compiladas do código principal
├── test/bin/              # Classes compiladas dos testes
├── .vscode/               # Configurações do VS Code
│   ├── launch.json
│   └── settings.json
├── run-tests.bat          # Script para Windows
└── run-tests.sh           # Script para Linux/Mac
```

### Como Executar os Testes

#### Windows:
```bash
.\run-tests.bat
```

#### Linux/Mac:
```bash
chmod +x run-tests.sh
./run-tests.sh
```

#### Manualmente:
```bash
# Compilar o projeto principal
javac -cp "lib/*" -d bin src/*.java

# Compilar os testes
javac -cp "lib/*:bin" -d test/bin test/java/*.java

# Executar os testes
java -cp "lib/*:bin:test/bin" org.junit.platform.console.ConsoleLauncher --scan-class-path
```

### Como Criar Novos Testes

1. Crie uma nova classe de teste em `test/java/`
2. Nomeie a classe com sufixo `Test` (ex: `PacienteServiceTest.java`)
3. Use as anotações do JUnit 5:
   - `@Test` - marca métodos de teste
   - `@BeforeEach` - executa antes de cada teste
   - `@AfterEach` - executa após cada teste
   - `@BeforeAll` - executa uma vez antes de todos os testes
   - `@AfterAll` - executa uma vez após todos os testes

### Exemplo de Teste

```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MinhaClasseTest {
    
    private MinhaClasse objeto;
    
    @BeforeEach
    void setUp() {
        objeto = new MinhaClasse();
    }
    
    @Test
    void testMetodo() {
        // Arrange
        String entrada = "teste";
        
        // Act
        String resultado = objeto.meuMetodo(entrada);
        
        // Assert
        assertEquals("resultado esperado", resultado);
    }
}
```

### Configuração do VS Code

O projeto está configurado para funcionar com a extensão "Extension Pack for Java" do VS Code. As configurações incluem:

- Caminhos de código fonte e testes
- Bibliotecas de referência
- Configurações de launch para debug e execução de testes

### Dependências JUnit

- **junit-jupiter-api-5.10.1.jar** - API principal do JUnit 5
- **junit-jupiter-engine-5.10.1.jar** - Engine de execução dos testes
- **junit-platform-console-standalone-1.10.1.jar** - Console standalone para execução

### Comandos Úteis

- Para executar apenas uma classe de teste específica:
  ```bash
  java -cp "lib/*:bin:test/bin" org.junit.platform.console.ConsoleLauncher --select-class=AppTest
  ```

- Para executar um método de teste específico:
  ```bash
  java -cp "lib/*:bin:test/bin" org.junit.platform.console.ConsoleLauncher --select-method=AppTest#testAppCreation
  ```



