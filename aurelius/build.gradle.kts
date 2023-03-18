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
            artifactId = Metadata.ARTIFACT
            version = Versions.Aurelius.NAME

            afterEvaluate {
                from(components[Variants.RELEASE])
            }
        }
    }
}

@Suppress("UnstableApiUsage")
android {
    namespace = Metadata.NAMESPACE
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

@Suppress("SpellCheckingInspection")
dependencies {
    api("androidx.compose.material3:material3:${Versions.COMPOSE_MATERIAL_3}")
    api("androidx.compose.ui:ui-tooling:${Versions.COMPOSE_UI}")
    api("androidx.customview:customview:${Versions.CUSTOMVIEW}")
    api("androidx.customview:customview-poolingcontainer:${Versions.CUSTOMVIEW_POOLINGCONTAINER}")
    api("androidx.fragment:fragment-ktx:${Versions.FRAGMENT}")
    api("androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.LIFECYCLE}")
    api("com.google.android.material:material:${Versions.MATERIAL}")

    implementation("com.google.accompanist:accompanist-pager:${Versions.ACCOMPANIST}")
    implementation(
        "com.google.accompanist:accompanist-placeholder-material:${Versions.ACCOMPANIST}"
    )
    implementation("com.google.accompanist:accompanist-systemuicontroller:${Versions.ACCOMPANIST}")
    implementation("androidx.appcompat:appcompat:${Versions.APPCOMPAT}")
    implementation("androidx.compose.material:material:${Versions.COMPOSE_MATERIAL}")
    implementation(
        "androidx.constraintlayout:constraintlayout-compose:${Versions.CONSTRAINTLAYOUT_COMPOSE}"
    )

    testImplementation("junit:junit:${Versions.JUNIT}")

    androidTestImplementation(Libraries.COMPOSE_UI_TEST_JUNIT_4)
    androidTestImplementation(Libraries.COMPOSE_UI_TEST_MANIFEST)
}
