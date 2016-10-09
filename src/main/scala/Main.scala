trait Censor {

  def replace(word: String): String = {
    if (word == "Shoot") {
      "Pucky"
    } else if (word == "Darn") {
      "Beans"
    } else {
      word
    }
  }

}

case class CurseWords(val words: List[String])
  extends Censor {

  def generateList() : List[String] = {
    words.map((x) => replace(x))
  }

}

object Main {

  def main(args: Array[String]){

    // TODO

  }

}
