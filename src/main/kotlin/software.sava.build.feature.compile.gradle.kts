plugins {
  id("java")
}

val jlv = JavaLanguageVersion.of(javaVersion("17"))

java {
  toolchain.languageVersion = jlv
}
