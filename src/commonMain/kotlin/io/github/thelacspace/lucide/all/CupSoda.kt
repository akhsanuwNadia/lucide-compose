package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CupSoda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(7.75,20.279998779296875)
                curveTo(7.890499591827393,21.274030685424805,8.746135711669922,22.009878158569336,9.75,21.999998092651367)
                lineTo(14.289999961853027,21.999998092651367)
                curveTo(15.293864250183105,22.009878158569336,16.14950180053711,21.274030685424805,16.290000915527344,20.279998779296875)
                lineTo(18.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(19.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                curveTo(8.59932804107666,14.32998275756836,10.40067195892334,14.32998275756836,12.0,15.0)
                curveTo(13.59932804107666,15.67001724243164,15.40067195892334,15.67001724243164,17.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(13.0,2.0)
                lineTo(15.0,2.0)
            }
}

public val LucideIcons.All.CupSodaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CupSoda: ImageVector
    @Composable get() = CupSodaDefinition.asImageVector()
