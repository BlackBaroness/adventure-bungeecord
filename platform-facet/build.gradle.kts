plugins {
    `java-library`
    id("buildlogic.java-21")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":api"))

    compileOnly(libs.adventure.api)
}