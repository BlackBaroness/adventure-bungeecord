plugins {
  buildlogic.`java-21`
  buildlogic.publish
}

repositories {
  mavenCentral()
}

dependencies {
  api(project(":platform-facet"))

  api(libs.adventure.api)
  api(libs.adventure.text.serializer.gson)
  api(libs.adventure.text.serializer.legacy)

  compileOnly(libs.bungeecord.api) { isTransitive = false }
  compileOnly(libs.bungeecord.chat)
  compileOnly(libs.bungeecord.serializer)
}
