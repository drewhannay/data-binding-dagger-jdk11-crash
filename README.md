# Repro Steps

Failure case:
- `export JAVA_HOME=/path/to/jdk11`
- `./gradlew :app:assembleDebug`

Success case:
- `export JAVA_HOME=/path/to/jdk8`
- `./gradlew :app:assembleDebug`

Alternatively build from Android Studio with the relevant JDK path set.
