package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessBishop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                curveTo(5.0,18.895429611206055,5.895430564880371,18.0,7.0,18.0)
                lineTo(17.0,18.0)
                curveTo(18.104570388793945,18.0,19.0,18.895429611206055,19.0,20.0)
                lineTo(19.0,21.0)
                curveTo(19.0,21.552284240722656,18.552284240722656,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(5.4477152824401855,22.0,5.0,21.552284240722656,5.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                curveTo(16.5,17.385000228881836,18.0,15.538999557495117,18.0,13.07699966430664)
                curveTo(18.0,8.769000053405762,14.5,4.461999893188477,12.0,2.0)
                curveTo(9.5,4.461999893188477,6.0,8.770000457763672,6.0,13.07699966430664)
                curveTo(6.0,15.538999557495117,7.5,17.385000228881836,9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(13.5,9.5)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
            }
}

public val LucideIcons.All.ChessBishopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessBishop: ImageVector
    @Composable get() = ChessBishopDefinition.asImageVector()
