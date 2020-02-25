import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.3.61"
}

group = "no.bekk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets["main"].java.srcDir("src/main/kotlin")

dependencies {
    implementation(kotlin("stdlib"))
    implementation("junit:junit:4.12")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")
}

application {
    mainClassName = "no.bekk.kotlinworkshop.Task1Kt"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs += listOf("-XXLanguage:+InlineClasses")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = application.mainClassName
    }
    from (
        configurations.runtime.get().map {
            if (it.isDirectory) it else zipTree(it)
        }
    )
}