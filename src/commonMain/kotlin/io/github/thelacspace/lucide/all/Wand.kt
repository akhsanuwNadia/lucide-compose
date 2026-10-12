package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                lineTo(15.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                lineTo(15.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,9.0)
                lineTo(10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                lineTo(22.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.799999237060547,11.800000190734863)
                lineTo(19.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(15.010000228881836,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.799999237060547,6.199999809265137)
                lineTo(19.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.199999809265137,6.199999809265137)
                lineTo(11.0,5.0)
            }
}

public val LucideIcons.All.WandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wand: ImageVector
    @Composable get() = WandDefinition.asImageVector()
