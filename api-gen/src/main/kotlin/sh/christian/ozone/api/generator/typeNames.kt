package sh.christian.ozone.api.generator

import com.squareup.kotlinpoet.ClassName

val ENCODING = ClassName("sh.christian.ozone.api.runtime", "Encoding")
val INSTANT = ClassName("kotlinx.datetime", "Instant")
val JSON_ELEMENT = ClassName("kotlinx.serialization.json", "JsonElement")
val JVM_INLINE = ClassName("kotlin.jvm", "JvmInline")
val KSERIALIZER = ClassName("kotlinx.serialization", "KSerializer")
val SERIALIZABLE = ClassName("kotlinx.serialization", "Serializable")
val SERIAL_NAME = ClassName("kotlinx.serialization", "SerialName")
