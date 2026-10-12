package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,8.0f)
                curveTo(13.0f,5.0f,9.0f,5.0f,11.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f,8.0f)
                curveTo(17.5f,5.0f,13.5f,5.0f,15.5f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                lineTo(6.01f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(6.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,16.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,6.0f)
                curveTo(21.10457f,6.0f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,6.8954306f,2.8954306f,6.0f,4.0f,6.0f)
                lineTo(7.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,20.0f)
                lineTo(5.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,20.0f)
                lineTo(19.0f,22.0f)
            }
}

public val LucideIcons.All.HeaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heater: ImageVector
    @Composable get() = HeaterDefinition.asImageVector()
