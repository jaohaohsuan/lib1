import Dependencies._

version := "0.0.1"

lazy val protobuf = (project in file("protobuf")).
  settings(Settings.settings: _*).
  settings(Settings.protobufSettings: _*).
  settings(
    scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation"),
    PB.targets in Compile := Seq(
      scalapb.gen(
        flatPackage = false
      ) -> (sourceManaged in Compile).value
    ),
    libraryDependencies ++= Seq(
      libs.scalapbRuntime,
      libs.grpc.netty,
      libs.grpc.scalapbRuntime
    ) ++ protobufDependencies
  ).
  configs(Test)

