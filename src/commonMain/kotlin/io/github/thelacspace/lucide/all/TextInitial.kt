package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextInitial") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(6.552999973297119,4.276000022888184)
                curveTo(6.637780666351318,4.106842517852783,6.81078577041626,4.000033378601074,7.0,4.000033378601074)
                curveTo(7.18921422958374,4.000033378601074,7.362219333648682,4.106842517852783,7.447000026702881,4.276000022888184)
                lineTo(11.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.9200000762939453,10.0)
                lineTo(10.079999923706055,10.0)
            }
}

public val LucideIcons.All.TextInitialDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextInitial: ImageVector
    @Composable get() = TextInitialDefinition.asImageVector()
