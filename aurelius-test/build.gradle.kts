plugins {
    id("com.android.library")
    id("kotlin-android")
    `maven-publish`
}

publishing {
    repositories {
        aurelius()
    }

    publications {
        register<MavenPublication>(Variants.RELEASE) {
            groupId = Metadata.GROUP
            artifactId = Metadata.artifact("test")
            version = Versions.Aurelius.NAME

            afterEvaluate {
                from(components[Variants.RELEASE])
            }
        }
    }
}

@Suppress("UnstableApiUsage")
android {
    namespace = Metadata.namespace("test")
    compileSdk = Versions.Aurelius.SDK_COMPILE

    defaultConfig {
        minSdk = Versions.Aurelius.SDK_MIN

        @Suppress("DEPRECATION")
        targetSdk = Versions.Aurelius.SDK_TARGET

        testInstrumentationRunner = Libraries.TEST_RUNNER
    }

    publishing {
        singleVariant(Variants.RELEASE) {
            withSourcesJar()
            withJavadocJar()
        }
    }

    buildTypes {
        getByName(Variants.RELEASE) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = Versions.java
        targetCompatibility = Versions.java
    }

    kotlinOptions {
        jvmTarget = Versions.java.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_COMPILER
    }
}

dependencies {
    implementation(project(":aurelius"))
    implementation(Libraries.COMPOSE_UI_TEST_JUNIT_4)
    implementation(Libraries.COMPOSE_UI_TEST_MANIFEST)
}
