package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CableCar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(10.010000228881836,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.010000228881836,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(22.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,6.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(17.0,12.0)
                lineTo(20.0,12.0)
                lineTo(20.0,22.0)
                lineTo(17.0,22.0)
                lineTo(7.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,12.0)
                lineTo(7.0,12.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,17.0)
                lineTo(20.0,17.0)
            }
}

public val LucideIcons.All.CableCarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CableCar: ImageVector
    @Composable get() = CableCarDefinition.asImageVector()
