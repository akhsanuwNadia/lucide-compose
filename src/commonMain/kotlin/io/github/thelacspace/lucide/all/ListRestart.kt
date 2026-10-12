package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListRestart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                curveTo(13.291291f,19.721722f,15.539428f,20.423986f,17.581139f,19.743416f)
                curveTo(19.62285f,19.062847f,21.0f,17.152151f,21.0f,15.0f)
                curveTo(21.0f,12.514719f,18.985281f,10.5f,16.5f,10.5f)
                curveTo(15.17f,10.5f,13.96f,11.04f,13.09f,11.91f)
                lineTo(11.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,10.0f)
                lineTo(11.0f,14.0f)
                lineTo(15.0f,14.0f)
            }
}

public val LucideIcons.All.ListRestartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListRestart: ImageVector
    @Composable get() = ListRestartDefinition.asImageVector()
