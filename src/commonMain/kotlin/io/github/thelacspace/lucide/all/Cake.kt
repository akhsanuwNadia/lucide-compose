package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,21.0f)
                lineTo(20.0f,13.0f)
                curveTo(20.0f,11.895431f,19.10457f,11.0f,18.0f,11.0f)
                lineTo(6.0f,11.0f)
                curveTo(4.8954306f,11.0f,4.0f,11.895431f,4.0f,13.0f)
                lineTo(4.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                curveTo(4.0f,16.0f,4.5f,15.0f,6.0f,15.0f)
                curveTo(7.5f,15.0f,8.5f,17.0f,10.0f,17.0f)
                curveTo(11.5f,17.0f,12.5f,15.0f,14.0f,15.0f)
                curveTo(15.5f,15.0f,16.5f,17.0f,18.0f,17.0f)
                curveTo(19.5f,17.0f,20.0f,16.0f,20.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(22.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,8.0f)
                lineTo(7.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,8.0f)
                lineTo(17.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,4.0f)
                lineTo(7.01f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,4.0f)
                lineTo(12.01f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,4.0f)
                lineTo(17.01f,4.0f)
            }
}

public val LucideIcons.All.CakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cake: ImageVector
    @Composable get() = CakeDefinition.asImageVector()
