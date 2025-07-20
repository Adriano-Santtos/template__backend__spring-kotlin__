import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val flywayVersion = "11.10.3"
    val kotlinVersion = "1.9.25"
    val ktLintVersion = "10.3.0"
    val springBootVersion = "3.5.3"
    val springDependencyManagementVersion = "1.1.4"

    id("io.spring.dependency-management") version springDependencyManagementVersion
    id("org.flywaydb.flyway") version flywayVersion
    id("org.jlleitschuh.gradle.ktlint") version ktLintVersion
    id("org.springframework.boot") version springBootVersion
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
}

group = "com" // TODO: Troque "com" pelo grupo do seu novo projeto ao usar este template.
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

val springDocOpenAPiVersion = "2.3.0"
val mockkVersion = "1.13.9"
val kotlinLogging = "7.0.7"

dependencies {
    // Spring Boot
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:$springDocOpenAPiVersion")

    // Kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // Logging
    implementation("io.github.oshai:kotlin-logging-jvm:$kotlinLogging")

    // database
    implementation("org.flywaydb:flyway-database-postgresql")
    runtimeOnly("org.postgresql:postgresql")

    // Unit tests
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.h2database:h2")
    testImplementation("io.mockk:mockk:$mockkVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
