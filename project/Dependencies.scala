import sbt._
import Keys._

object Dependencies {

  lazy val libs = new  {

    private val version = new {
      val scalaTest       = "3.0.0"
      val scalaCheck      = "1.13.4"
    }

    val test  = "org.scalatest" %% "scalatest" % version.scalaTest % Test
    val check = "org.scalacheck" %% "scalacheck" % version.scalaCheck % Test
    val scalapbRuntime = "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf"

    lazy val grpc = new {
        import com.trueaccord.scalapb.compiler.Version._
        val netty = "io.grpc" % "grpc-netty" % grpcJavaVersion
        val scalapbRuntime = "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion
      }
  }



  val protobufDependencies: Seq[ModuleID] = Seq(
    libs.test,
    libs.check
  )

}
