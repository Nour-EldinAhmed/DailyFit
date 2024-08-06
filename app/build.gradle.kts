plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.nour.dailyfit"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nour.dailyfit"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation (libs.constraintlayout)
    implementation ("androidx.navigation:navigation-fragment:2.7.7")
    implementation ("androidx.navigation:navigation-ui:2.3.5")
    implementation ("com.google.firebase:firebase-firestore:21.4.0")
    implementation ("com.google.firebase:firebase-auth:19.2.0")
    implementation ("com.google.firebase:firebase-storage:19.1.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    implementation ("com.github.bumptech.glide:glide:4.14.2")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation ("com.applandeo:material-calendar-view:1.7.0")
    implementation ("com.github.AppIntro:AppIntro:6.2.0")
    implementation ("com.google.android.gms:play-services-auth:20.5.0")
    implementation ("com.google.android.gms:play-services-oss-licenses:17.0.0")
    implementation ("com.applandeo:material-calendar-view:1.9.2")
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")

}