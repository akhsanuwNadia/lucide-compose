package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,21.0)
                lineTo(20.0,13.0)
                curveTo(20.0,11.895430564880371,19.104570388793945,11.0,18.0,11.0)
                lineTo(6.0,11.0)
                curveTo(4.895430564880371,11.0,4.0,11.895430564880371,4.0,13.0)
                lineTo(4.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                curveTo(4.0,16.0,4.5,15.0,6.0,15.0)
                curveTo(7.5,15.0,8.5,17.0,10.0,17.0)
                curveTo(11.5,17.0,12.5,15.0,14.0,15.0)
                curveTo(15.5,15.0,16.5,17.0,18.0,17.0)
                curveTo(19.5,17.0,20.0,16.0,20.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(22.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,8.0)
                lineTo(7.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,8.0)
                lineTo(17.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,4.0)
                lineTo(7.010000228881836,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,4.0)
                lineTo(12.010000228881836,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,4.0)
                lineTo(17.010000228881836,4.0)
            }
}

public val LucideIcons.All.CakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cake: ImageVector
    @Composable get() = CakeDefinition.asImageVector()
