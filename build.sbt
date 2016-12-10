name := "learning-aspectj-in-action-2"

scalaVersion := "2.12.0"

aspectjSettings

fork := true

// add compiled classes as an input to aspectj
AspectjKeys.inputs in Aspectj <+= compiledClasses

// use the results of aspectj weaving
products in Compile <<= products in Aspectj

products in Runtime <<= products in Compile

javaOptions <++= AspectjKeys.weaverOptions in Aspectj
