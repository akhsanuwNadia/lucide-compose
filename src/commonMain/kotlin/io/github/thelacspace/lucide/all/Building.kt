package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Building") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.01f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                lineTo(16.01f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(16.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(8.01f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(8.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(8.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                lineTo(9.0f,19.0f)
                curveTo(9.0f,18.447716f,9.447715f,18.0f,10.0f,18.0f)
                lineTo(14.0f,18.0f)
                curveTo(14.552285f,18.0f,15.0f,18.447716f,15.0f,19.0f)
                lineTo(15.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,22.0f)
                lineTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,2.0f)
                lineTo(6.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.BuildingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Building: ImageVector
    @Composable get() = BuildingDefinition.asImageVector()
