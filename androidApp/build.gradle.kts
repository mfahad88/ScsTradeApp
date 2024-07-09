plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
//    alias(libs.plugins.compose.compiler)
    kotlin("kapt")
//    id("com.google.dagger.hilt.android") version "2.48" apply false
//   id("dagger.hilt.android.plugin:2.4.1")

}

android {
    namespace = "com.example.scstradeapp.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.scstradeapp.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    viewBinding {
        enable = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(projects.shared)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
  /*  implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
    debugImplementation(libs.compose.ui.tooling)*/
}