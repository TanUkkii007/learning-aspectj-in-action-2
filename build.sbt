name := "learning-aspectj-in-action-2"

scalaVersion := "2.12.0"

aspectjSettings

fork := true

// binary weaving
//inputs is jars or class directories to weave. Passed to the -inpath AspectJ option.
// If you use load-time weaving, using -javaagent and aop.xml, this is not needed.
//AspectjKeys.inputs in Aspectj <+= compiledClasses

// use the results of aspectj weaving
//products in Compile <<= products in Aspectj

//products in Runtime <<= products in Compile

javaOptions <++= AspectjKeys.weaverOptions in Aspectj
