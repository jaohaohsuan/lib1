package com.grandsys.inu.protos.storedq

import com.grandsys.inu.protos.storedQuery.commands.AddClause
import com.grandsys.inu.protos.storedQuery.commands.AddClause.Clause
import com.grandsys.inu.protos.storedQuery.models._
import org.scalatest._

class StoredQueryGrpcTest  extends FlatSpec with Matchers  {

  "StoredQuery grpc" should "generated" in {
    //val c1: com.grandsys.inu.models.Command = com.grandsys.inu.protos.storedq.commands.CreateStoredQuery()
    val c1 = AddClause(clause = AddClause.Clause.Match(new MatchClause()))
    c1.clause match {
      case Clause.SpanNear(s) =>
    }

    var b: BoolClause = null
    var d: Map[Int,String] = Map.empty


  }

}