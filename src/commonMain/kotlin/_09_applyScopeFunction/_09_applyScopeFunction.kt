// apply scope function
package _09_applyScopeFunction

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
// |     left       |           |
// |                |   right   |
// |                |           |
// +----------------+-----------+

fun main() { // who can spot a bug in this code?
    val row = Row()
    val rightColumn = Column()
    row.addChild(Label("left"))
    val innerRow = Row()
    rightColumn.addChild(innerRow)
    innerRow.addChild(Label("1"))
    innerRow.addChild(Label("2"))
    rightColumn.addChild(Label("prima"))
    Row().apply {
        addChild(Label("wat leuk!"))
        addChild(Column().apply {
            addChild(Row().apply {
                addChild(Label("1"))
                addChild(Label("2"))
            })
            addChild(Label("prima"))
        })
    }
}
