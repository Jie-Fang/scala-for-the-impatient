object ex4 extends App {
  abstract class Item {
    def price: Double
    def description: String
  }
  class SimpleItem(override val price: Double, override val description: String) extends Item {

  }
  class Bundle extends Item {
    private var items: List[Item] = List()

    override def price: Double = items.map(_.price).sum
    def add(item: Item) = items = items :+ item
    override def description = items.map(_.description).mkString(", ")
  }
}
