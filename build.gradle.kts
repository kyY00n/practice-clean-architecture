plugins {
    java

    kotlin("jvm") version "1.6.20-M1"
    kotlin("plugin.spring") version "1.6.20-M1"
    kotlin("kapt") version "1.6.20-M1"

    id("org.springframework.boot") version "2.6.3"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-spring")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
        google()
    }
}
