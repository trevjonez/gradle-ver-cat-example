plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("new-module") {
            id = "com.aetna.subconv"
            implementationClass = "com.aetna.SubConventions"
        }
    }
}

dependencies {
    api(libs.commons.lang3)
}