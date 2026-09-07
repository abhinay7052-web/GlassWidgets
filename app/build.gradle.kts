plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.abhinay.glasswidgets"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.abhinay.glasswidgets"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
}
