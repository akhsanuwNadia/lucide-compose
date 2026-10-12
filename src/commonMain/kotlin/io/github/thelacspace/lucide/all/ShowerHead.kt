package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShowerHead") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(6.5f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f,6.5f)
                curveTo(11.561411f,4.60017f,8.454471f,4.615856f,6.5351634f,6.5351634f)
                curveTo(4.615856f,8.454471f,4.60017f,11.561411f,6.5f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(5.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.0f)
                lineTo(14.0f,17.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                lineTo(10.0f,16.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,13.0f)
                lineTo(13.0f,13.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                lineTo(16.0f,10.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                lineTo(11.0f,20.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.0f,14.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,11.0f)
                lineTo(20.0f,11.01f)
            }
}

public val LucideIcons.All.ShowerHeadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShowerHead: ImageVector
    @Composable get() = ShowerHeadDefinition.asImageVector()
