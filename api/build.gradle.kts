plugins {
  buildlogic.`java-21`
  buildlogic.publish
}

repositories {
  mavenCentral()
}

dependencies {
  api(libs.adventure.api)
}
