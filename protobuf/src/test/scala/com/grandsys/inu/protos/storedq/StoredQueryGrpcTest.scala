package com.grandsys.inu.protos.storedq

import org.scalatest._

class StoredQueryGrpcTest  extends FlatSpec with Matchers  {

  "StoredQuery grpc" should "generated" in {
    val c1: com.grandsys.inu.models.Command = com.grandsys.inu.protos.storedq.commands.CreateStoredQuery()

  }

}