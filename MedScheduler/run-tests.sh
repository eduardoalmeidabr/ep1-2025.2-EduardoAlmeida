#!/bin/bash
echo "Compilando o projeto..."
javac -cp "lib/*" -d bin src/*.java

echo "Compilando os testes..."
javac -cp "lib/*:bin" -d test/bin test/java/*.java

echo "Executando os testes..."
java -cp "lib/*:bin:test/bin" org.junit.platform.console.ConsoleLauncher --scan-class-path



