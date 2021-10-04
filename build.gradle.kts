import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
//    id("application")
    id("org.springframework.boot") version "2.5.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.spring") version "1.5.31"
}

//apply{
//    plugin("kotlin")
//    plugin("kotlin-spring")
//    plugin("java")
//    plugin("org.springframework.boot")
//}

group = "heroku.test"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

//application {
//    mainClass.set("heroku.test.first.FirstApplication")
//}


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

//tasks.withType<Jar> {
//    duplicatesStrategy = DuplicatesStrategy.WARN
//    // Otherwise you'll get a "No main manifest attribute" error
//    manifest {
//        attributes["Main-Class"] = "heroku.test.first.FirstApplicationKt"
//    }
//
//    // To add all of the dependencies otherwise a "NoClassDefFoundError" error
//    from(sourceSets.main.get().output)
//
//    dependsOn(configurations.runtimeClasspath)
//    from({
//        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
//    })
//}

tasks.withType<Test> {
    useJUnitPlatform()
}
