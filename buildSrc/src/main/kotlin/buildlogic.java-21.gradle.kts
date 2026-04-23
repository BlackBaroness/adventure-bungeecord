plugins {
  java
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

tasks.withType<JavaCompile> {
  options.release = 21
}
