package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,8.0)
                curveTo(13.0,5.0,9.0,5.0,11.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5,8.0)
                curveTo(17.5,5.0,13.5,5.0,15.5,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(6.010000228881836,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(6.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                lineTo(10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,16.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,16.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,6.0)
                curveTo(21.104570388793945,6.0,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,18.0)
                curveTo(22.0,19.104570388793945,21.104570388793945,20.0,20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                lineTo(7.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                lineTo(5.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,20.0)
                lineTo(19.0,22.0)
            }
}

public val LucideIcons.All.HeaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heater: ImageVector
    @Composable get() = HeaterDefinition.asImageVector()
