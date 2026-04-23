plugins {
  id("buildlogic.java-21")
  id("buildlogic.publish")
}

repositories {
  mavenCentral()
}

dependencies {
  api(libs.adventure.api)
}
