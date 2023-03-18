plugins {
  kotlin("multiplatform")
  kotlin("plugin.serialization")
  id("org.jetbrains.compose")
  id("com.android.library")
}

kotlin {
  android()
  jvm("desktop")

  sourceSets {
    val commonMain by getting {
      dependencies {
        api(compose.runtime)
        api(compose.foundation)
        api(compose.material3)

        api("com.squareup.workflow1:workflow-core:1.10.0-beta01")
        api("com.squareup.workflow1:workflow-runtime:1.10.0-beta01")

        // Uncomment to fetch all icons.
        // implementation("androidx.compose.material:material-icons-extended:1.3.1")
        implementation("com.alialbaali.kamel:kamel-image:0.4.1")
        implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")

        api(project(":api"))
        api(project(":store"))
      }
    }
  }
}

android {
  compileSdk = 33
  namespace = "sh.christian.ozone.common"

  defaultConfig {
    minSdk = 26
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
}
