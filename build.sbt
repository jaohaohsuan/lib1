import Dependencies._
import Settings._


version := "0.0.1"

lazy val protobuf = (project in file("protobuf")).
  settings(Settings.settings: _*).
  settings(Settings.protobufSettings: _*).
  settings(

    PB.targets in Compile := Seq(
      scalapb.gen() -> (sourceManaged in Compile).value
    ),
    libraryDependencies ++= Seq(
      libs.scalapbRuntime,
      libs.grpc.netty,
      libs.grpc.scalapbRuntime
    ) ++ protobufDependencies
  ).
  configs(Test)

