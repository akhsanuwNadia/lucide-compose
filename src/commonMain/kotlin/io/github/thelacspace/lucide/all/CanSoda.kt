package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CanSoda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,22.0f)
                lineTo(18.664f,19.504f)
                curveTo(18.883173f,19.175306f,19.000088f,18.789064f,19.0f,18.394f)
                lineTo(19.0f,5.606f)
                curveTo(19.000088f,5.210935f,18.883171f,4.8246937f,18.664f,4.496f)
                lineTo(17.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,2.0f)
                lineTo(6.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                lineTo(19.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                lineTo(19.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(5.336f,19.504f)
                curveTo(5.1168275f,19.175306f,4.9999113f,18.789064f,5.0f,18.394f)
                lineTo(5.0f,5.606f)
                curveTo(4.9999113f,5.210935f,5.1168275f,4.8246937f,5.336f,4.496f)
                lineTo(7.0f,2.0f)
            }
}

public val LucideIcons.All.CanSodaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CanSoda: ImageVector
    @Composable get() = CanSodaDefinition.asImageVector()
