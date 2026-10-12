package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Syringe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,2.0)
                lineTo(22.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                lineTo(20.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,9.0)
                lineTo(8.699999809265137,19.299999237060547)
                curveTo(7.699999809265137,20.299999237060547,6.199999809265137,20.299999237060547,5.299999713897705,19.299999237060547)
                lineTo(4.699999809265137,18.69999885559082)
                curveTo(3.6999998092651367,17.69999885559082,3.6999998092651367,16.19999885559082,4.699999809265137,15.299999237060547)
                lineTo(15.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(13.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,19.0)
                lineTo(2.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(20.0,10.0)
            }
}

public val LucideIcons.All.SyringeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Syringe: ImageVector
    @Composable get() = SyringeDefinition.asImageVector()
