// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        maven {
            url = uri(Config.mavenUrl)
        }
    }
    dependencies {
        classpath (Dependency.Classpath.serialization)
        classpath (Dependency.Classpath.navigation)
    }
}

plugins {
    id(Plugins.serialization).version(Plugins.serializationVersion)
    id(Plugins.application).version(Plugins.applicationVersion).apply(false)
    id(Plugins.library).version(Plugins.applicationVersion).apply(false)
    id(Plugins.android).version(Plugins.jetbrainsVersion).apply(false)
}