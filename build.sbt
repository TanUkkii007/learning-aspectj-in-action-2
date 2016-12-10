name := "learning-aspectj-in-action-2"

scalaVersion := "2.12.0"

aspectjSettings

fork := true

javaOptions <++= AspectjKeys.weaverOptions in Aspectj
