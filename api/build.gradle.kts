plugins {
    `java-library`
    id("buildlogic.java-21")
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.adventure.api)
}