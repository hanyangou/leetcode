Calculating the occurrence for each element in List
var immutableMap : Map[Int, Int] = list.groupBy(identity).mapValues(_.length)

Convert immutable map to mutable map
    val mutableMap = collection.mutable.Map(immutableMap.toSeq: _*)