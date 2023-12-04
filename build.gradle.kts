import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion = "2.3.6"
val mockkVersion = "1.13.8"

plugins {
    application
    kotlin("jvm") version "1.9.20"
}

java.sourceCompatibility = JavaVersion.VERSION_17

group = "no.bekk"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "https://dl.bintray.com/kotlin/ktor")
    mavenCentral()
}

sourceSets["main"].java.srcDir("src/main/kotlin")
sourceSets["test"].java.srcDir("src/main/test")

dependencies {
    implementation(kotlin("stdlib"))
    implementation("junit:junit:4.13.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
    implementation("io.ktor:ktor-client-apache-jvm:2.3.6")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.6")
    implementation("io.ktor:ktor-client-content-negotiation:2.3.6")
    implementation("io.ktor:ktor-client-jackson-jvm:2.3.6")
    implementation("io.ktor:ktor-server-locations-jvm:2.3.6")
    implementation("io.ktor:ktor-serialization-jackson:2.3.6")
    implementation("com.h2database:h2:2.2.224")
    implementation("com.zaxxer:HikariCP:5.1.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.16.0")
    implementation("ch.qos.logback:logback-classic:1.2.11")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
    kotlinOptions.freeCompilerArgs += listOf("-XXLanguage:+InlineClasses")
}
