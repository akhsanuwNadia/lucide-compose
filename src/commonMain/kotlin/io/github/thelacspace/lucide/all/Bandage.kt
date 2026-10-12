package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bandage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.010000228881836)
                lineTo(10.010000228881836,10.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.010000228881836)
                lineTo(10.010000228881836,14.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.010000228881836)
                lineTo(14.010000228881836,10.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.010000228881836)
                lineTo(14.010000228881836,14.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(20.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,18.0)
                lineTo(20.0,18.0)
                lineTo(4.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.BandageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bandage: ImageVector
    @Composable get() = BandageDefinition.asImageVector()
