package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}
import scala.collection.mutable

/** Node base type for compiletime-only checks to improve type safety.
 * EMT stands for: "erased marker trait", i.e. it is erased at runtime */
trait MynodetypeEMT extends AnyRef with HasMypropertyEMT

trait MynodetypeBase extends AbstractNode with StaticType[MynodetypeEMT] {
  
  override def propertiesMap: java.util.Map[String, Any] = {
 import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*
 val res = new java.util.HashMap[String, Any]()
if (("": String) != this.myproperty) res.put("MYPROPERTY", this.myproperty )
 res
}
}

object Mynodetype {
  val Label = "MYNODETYPE"
}

/** * NODE PROPERTIES:

*▸ Myproperty (String); Cardinality `one` (mandatory with default value ``)*/
class Mynodetype(graph_4762: flatgraph.Graph, seq_4762: Int) extends StoredNode(graph_4762, 31, seq_4762) with MynodetypeBase with StaticType[MynodetypeEMT] {
  

  override def productElementName(n: Int): String =
    n match {
      case 0 => "myproperty"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.myproperty
      case _ => null
    }

  override def productPrefix = "Mynodetype"
  override def productArity = 1

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[Mynodetype]
}
