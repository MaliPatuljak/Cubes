plugins {
    id("java")
}

group = "com.github.MaliPatuljak"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.1")
    testImplementation("com.github.stefanbirkner:system-rules:1.19.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}