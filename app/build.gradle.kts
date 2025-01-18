plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.compose.compiler)
	kotlin("plugin.serialization") version "2.0.20"

}

android {
	namespace = "com.rushi.ictinfracon"
	compileSdk = 35

	defaultConfig {
		applicationId = "com.rushi.ictinfracon"
		minSdk = 23
		targetSdk = 35
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
		}
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

	kotlinOptions {
		jvmTarget = "1.8"
	}

	buildFeatures {
		compose = true
	}

	composeOptions {
		kotlinCompilerExtensionVersion = "1.5.1"
	}

	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {

	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	implementation(libs.androidx.activity.compose)
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.ui)
	implementation(libs.androidx.ui.graphics)
	implementation(libs.androidx.ui.tooling.preview)
	implementation(libs.androidx.material3)

	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.junit)
	androidTestImplementation(libs.androidx.espresso.core)
	androidTestImplementation(platform(libs.androidx.compose.bom))
	androidTestImplementation(libs.androidx.ui.test.junit4)
	debugImplementation(libs.androidx.ui.tooling)
	debugImplementation(libs.androidx.ui.test.manifest)

	// Location Services
	implementation("com.google.android.gms:play-services-location:21.0.1")

	// Coil for Image Loading
	implementation("io.coil-kt:coil-compose:2.7.0")

	// Permissions Handling (Accompanist)
	implementation("com.google.accompanist:accompanist-permissions:0.36.0")

	// Material Icons (Optional for more icons)
	implementation("androidx.compose.material:material-icons-extended:1.7.6")

	// Navigation for Compose
	val nav_version = "2.8.0"
	implementation("androidx.navigation:navigation-compose:$nav_version")

	// Serialization for Kotlin
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")

	// Splash screen
	implementation("androidx.core:core-splashscreen:1.0.0")


}
