pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "adventure-platform-parent"

include(
    "api",
    "platform-bungeecord",
    "platform-facet",
    "text-serializer-bungeecord",
)