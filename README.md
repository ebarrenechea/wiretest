# wiretest
Sample project that reproduces a build issue with wire code generation. Running `./gradlew :shared:build` will fail on the `compileCommonMainKotlinMetadata` task with an "This class does not have a constructor" error on the generated Message.Builder code. 
