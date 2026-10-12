package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HdmiPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,9.0)
                curveTo(22.0,8.447714805603027,21.552284240722656,8.0,21.0,8.0)
                lineTo(3.0,8.0)
                curveTo(2.4477152824401855,8.0,2.0,8.447714805603027,2.0,9.0)
                lineTo(2.0,13.0)
                curveTo(2.0,13.552285194396973,2.4477152824401855,14.0,3.0,14.0)
                lineTo(3.5,14.0)
                curveTo(4.129514694213867,14.0,4.722290992736816,14.296388626098633,5.099999904632568,14.800000190734863)
                lineTo(5.400000095367432,15.199999809265137)
                curveTo(5.777709007263184,15.703611373901367,6.370485305786133,16.0,7.0,16.0)
                lineTo(17.0,16.0)
                curveTo(17.629514694213867,16.0,18.222291946411133,15.703611373901367,18.600000381469727,15.199999809265137)
                lineTo(18.899999618530273,14.800000190734863)
                curveTo(19.277708053588867,14.296388626098633,19.870485305786133,14.0,20.5,14.0)
                lineTo(21.0,14.0)
                curveTo(21.552284240722656,14.0,22.0,13.552285194396973,22.0,13.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(16.0,12.0)
            }
}

public val LucideIcons.All.HdmiPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HdmiPort: ImageVector
    @Composable get() = HdmiPortDefinition.asImageVector()
