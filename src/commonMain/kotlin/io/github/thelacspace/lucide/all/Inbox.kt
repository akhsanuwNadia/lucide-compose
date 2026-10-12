package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Inbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(16.0,12.0)
                lineTo(14.0,15.0)
                lineTo(10.0,15.0)
                lineTo(8.0,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.449999809265137,5.110000133514404)
                lineTo(2.0,12.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                lineTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,12.0)
                lineTo(18.549999237060547,5.110000133514404)
                curveTo(18.212268829345703,4.430342674255371,17.518943786621094,4.000402927398682,16.760000228881836,4.0)
                lineTo(7.239999771118164,4.0)
                curveTo(6.481055736541748,4.000402927398682,5.787729740142822,4.430342197418213,5.449999809265137,5.110000133514404)
                close()
            }
}

public val LucideIcons.All.InboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Inbox: ImageVector
    @Composable get() = InboxDefinition.asImageVector()
