-optimizations !class/unboxing/enum

-keepattributes EnclosingMethod,Signature,Exceptions,annotations,InnerClasses,LineNumberTable
-dontwarn com.fasterxml.jackson.**
-keep public class com.fasterxml.jackson.** { *; }
-keep public class * extends com.fasterxml.jackson.databind.JsonDeserializer
-keep public class * extends com.fasterxml.jackson.databind.JsonSerializer
-keep public class * extends com.fasterxml.jackson.databind.util.StdConverter

-keep class me.manabreak.r8agp7bug.data.** { *; }

-keep class kotlin.reflect.** { *; }

# The below line seems to be the culprit. Uncommenting it solves the issue.
-keep class kotlin.Metadata { *; }