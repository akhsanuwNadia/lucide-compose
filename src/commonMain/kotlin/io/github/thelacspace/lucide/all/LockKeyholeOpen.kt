package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LockKeyholeOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,16.0)
                curveTo(10.998397827148438,16.35833168029785,11.188645362854004,16.69013023376465,11.49870491027832,16.869760513305664)
                curveTo(11.80876350402832,17.049388885498047,12.19123649597168,17.049388885498047,12.50129508972168,16.869760513305664)
                curveTo(12.811354637145996,16.69013023376465,13.001602172851562,16.35833168029785,13.0,16.0)
                curveTo(13.001602172851562,15.641669273376465,12.811354637145996,15.309869766235352,12.50129508972168,15.130240440368652)
                curveTo(12.19123649597168,14.950610160827637,11.80876350402832,14.950610160827637,11.49870491027832,15.130240440368652)
                curveTo(11.188645362854004,15.309869766235352,10.998397827148438,15.641669273376465,11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(19.0,10.0)
                lineTo(21.0,10.0)
                lineTo(21.0,22.0)
                lineTo(19.0,22.0)
                lineTo(5.0,22.0)
                lineTo(3.0,22.0)
                lineTo(3.0,10.0)
                lineTo(5.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(7.0,7.0)
                curveTo(7.0000996589660645,4.737059593200684,8.520057678222656,2.7562949657440186,10.705888748168945,2.170595407485962)
                curveTo(12.891718864440918,1.5848959684371948,15.198430061340332,2.5402936935424805,16.329999923706055,4.5)
            }
}

public val LucideIcons.All.LockKeyholeOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LockKeyholeOpen: ImageVector
    @Composable get() = LockKeyholeOpenDefinition.asImageVector()
