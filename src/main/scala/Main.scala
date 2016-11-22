trait Censor {

  def replace(word: String): String = word match {
    case "Shoot" => "Pucky"
    case "Darn" => "Beans"
    case _ => word
  }

}

case class CurseWords(val words: List[String])
  extends Censor {

  def generateList(): List[String] = {
    words.map((x) => replace(x))
  }

}

object Main {

  def showList(list: List[String]): Unit = {
    if (!list.isEmpty) {
      println(list.head)
      showList(list.tail)
    }
  }

  def main(args: Array[String]){

    val l: List[String] = List("Tony", "Geezer", "Shoot", "Darn", "Ozzy", "Bill", "Shoot")
    val cw: CurseWords = new CurseWords(l)

    println("Original List: \n")
    showList(l)

    println()

    println("New List: \n")
    showList(cw.generateList())

  }

}

