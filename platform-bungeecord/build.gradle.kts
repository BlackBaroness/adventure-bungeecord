plugins {
  id("buildlogic.java-21")
  id("buildlogic.publish")
}

repositories {
  mavenCentral()
}

dependencies {
  api(project(":platform-facet"))
  api(project(":text-serializer-bungeecord"))

  api(libs.adventure.api)
  api(libs.adventure.text.serializer.gson)
  api(libs.adventure.text.serializer.legacy)

  compileOnly(libs.bungeecord.api) { isTransitive = false }
  compileOnly(libs.bungeecord.chat)
  compileOnly(libs.bungeecord.event)
  compileOnly(libs.bungeecord.serializer)
  compileOnly(libs.bungeecord.protocol) { isTransitive = false }
}
