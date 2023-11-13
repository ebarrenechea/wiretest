plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.wire)
}

wire {
    kotlin {
        javaInterop = true
    }
}

kotlin {
    jvm { }

    js(IR) {
        nodejs()
    }
    
    iosArm64 {
        binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }
}
