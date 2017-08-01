import Dependencies._
import Settings._

lazy val protobuf = (project in file("protobuf")).
  settings(Settings.settings: _*).
  settings(Settings.protobufSettings: _*).
  configs(Test)

