plugins {
    kotlin("jvm") version "2.2.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("lessons.lesson10.homeworks.MapsKt")
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation(kotlin("test"))
}
