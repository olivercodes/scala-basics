import scala.io.Source
import scala.collection.immutable.TreeMap
import scala.util.Failure

def foldListToTreeMap(list: List[String]) = list.foldLeft(
  TreeMap[Int, Int]()) { 
    (map, listValue) => map + (list.indexOf(listValue) + 1 -> listValue.length) 
  }

def returnLinesGreaterThan80Chars(m: Map[Int, Int]) = m.filter(x => x._2 > 50)

def lintListOfLines = returnLinesGreaterThan80Chars _ compose foldListToTreeMap _

try {
  val lines = Source.fromFile(args(0)).getLines().toList
  val lintedLines = lintListOfLines(lines)
  println("lines greater than 80")
  lintedLines.foreach(x => println("ln: " + x._1 + ", length: " + x._2))
} catch {
  case e: Exception => Console.err.println("Please enter filename")
}
