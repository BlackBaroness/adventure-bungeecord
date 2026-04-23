plugins {
  buildlogic.`java-21`
  buildlogic.publish
}

repositories {
  mavenCentral()
}

dependencies {
  api(project(":api"))

  api(libs.adventure.api)
}
