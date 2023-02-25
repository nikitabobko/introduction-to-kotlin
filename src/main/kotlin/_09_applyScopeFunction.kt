// apply scope function
interface Widget
abstract class Container : Widget {
    private val children: MutableList<Widget> = ArrayList()

    fun addChild(widget: Widget) {
        children.add(widget)
    }
}
class Column : Container()
class Row : Container()
class Label(val text: String) : Widget

// +----------------+-----+-----+
// |                |  1  |  2  |
// |                |-----+-----+
// |   wat leuk!    |           |
// |                |   prima   |
// |                |           |
// +----------------+-----------+

fun main() { // who can spot a bug in this code?
    val row = Row()
    val rightColumn = Column()
    row.addChild(Label("wat leuk!"))
    val innerRow = Row()
    rightColumn.addChild(innerRow)
    innerRow.addChild(Label("1"))
    innerRow.addChild(Label("2"))
    rightColumn.addChild(Label("prima"))
}
