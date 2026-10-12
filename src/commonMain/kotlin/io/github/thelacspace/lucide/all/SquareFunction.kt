package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareFunction") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                curveTo(11.0,17.0,11.800000190734863,16.0,11.800000190734863,14.199999809265137)
                lineTo(11.800000190734863,10.0)
                curveTo(11.800000190734863,8.0,12.800000190734863,6.699999809265137,15.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.199999809265137)
                lineTo(14.699999809265137,11.199999809265137)
            }
}

public val LucideIcons.All.SquareFunctionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareFunction: ImageVector
    @Composable get() = SquareFunctionDefinition.asImageVector()
