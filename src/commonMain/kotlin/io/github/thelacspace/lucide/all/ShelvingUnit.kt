package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShelvingUnit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,9.0)
                curveTo(12.0,8.447714805603027,11.552285194396973,8.0,11.0,8.0)
                lineTo(9.0,8.0)
                curveTo(8.447714805603027,8.0,8.0,8.447714805603027,8.0,9.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,20.0)
                lineTo(16.0,17.0)
                curveTo(16.0,16.447715759277344,15.552285194396973,16.0,15.0,16.0)
                lineTo(13.0,16.0)
                curveTo(12.447714805603027,16.0,12.0,16.447715759277344,12.0,17.0)
                lineTo(12.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,22.0)
                lineTo(20.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(20.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,2.0)
                lineTo(4.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
            }
}

public val LucideIcons.All.ShelvingUnitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShelvingUnit: ImageVector
    @Composable get() = ShelvingUnitDefinition.asImageVector()
