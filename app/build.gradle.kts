// Projet UNIQUE du module M203 : toutes les bibliothèques des 36 séances sont déclarées ici dès la
// première séance. Une seule synchronisation Gradle (avec Internet), ensuite tout fonctionne hors ligne.
// Ne rien ajouter ici pendant les séances.
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "ma.ofppt.ista.alamal"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "ma.ofppt.ista.alamal"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))       // JetPack Compose (S32 → S39)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)                   // AppCompatActivity (vues XML)
    implementation(libs.androidx.cardview)                    // CardView
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.constraintlayout)            // ConstraintLayout (S06)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)           // écran de démarrage
    implementation(libs.androidx.dynamicanimation)            // animation physique (S22)
    implementation(libs.androidx.fragment.ktx)                // Fragments (S08)
    implementation(libs.androidx.navigation.fragment.ktx)     // Navigation Drawer (S19)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.recyclerview)                // RecyclerView (S11)
    implementation(libs.androidx.viewpager2)                  // ViewPager2 (S08)
    implementation(libs.circleimageview)                      // images cerclées (S11)
    implementation(libs.glide)                                // Glide : charger des images (S11)
    implementation(libs.material)                             // Material Design (S15)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
