plugins {
    `java-library`
    id("buildlogic.java-21")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":platform-facet"))

    compileOnly(libs.adventure.api)
    compileOnly(libs.adventure.text.serializer.gson)
    compileOnly(libs.adventure.text.serializer.legacy)

    compileOnly(libs.bungeecord.api) { isTransitive = false }
    compileOnly(libs.bungeecord.chat)
    compileOnly(libs.bungeecord.serializer)
}