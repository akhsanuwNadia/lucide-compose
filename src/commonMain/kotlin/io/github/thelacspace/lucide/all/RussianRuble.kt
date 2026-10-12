package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RussianRuble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                lineTo(14.0,11.0)
                curveTo(16.20215606689453,10.990151405334473,17.98215103149414,9.202178001403809,17.98215103149414,7.0)
                curveTo(17.98215103149414,4.797821521759033,16.20215606689453,3.0098483562469482,14.0,3.0)
                lineTo(9.0,3.0)
                lineTo(9.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                lineTo(14.0,15.0)
            }
}

public val LucideIcons.All.RussianRubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RussianRuble: ImageVector
    @Composable get() = RussianRubleDefinition.asImageVector()
