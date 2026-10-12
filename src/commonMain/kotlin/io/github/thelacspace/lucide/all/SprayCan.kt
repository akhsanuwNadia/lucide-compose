package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SprayCan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.01f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,5.0f)
                lineTo(7.01f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,7.0f)
                lineTo(11.01f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.01f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                lineTo(7.01f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(3.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(19.0f,5.0f)
                lineTo(19.0f,9.0f)
                lineTo(15.0f,9.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(21.0f,11.0f)
                lineTo(21.0f,21.0f)
                curveTo(21.0f,21.6f,20.6f,22.0f,20.0f,22.0f)
                lineTo(14.0f,22.0f)
                curveTo(13.4f,22.0f,13.0f,21.6f,13.0f,21.0f)
                lineTo(13.0f,11.0f)
                lineTo(15.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,14.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                lineTo(21.0f,17.0f)
            }
}

public val LucideIcons.All.SprayCanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SprayCan: ImageVector
    @Composable get() = SprayCanDefinition.asImageVector()
